package com.palmagroup.mcell.gui.orders.pages

import geb.Module

class OrderDetailsPageObject extends Module {
	static content = {
		tabName{ $('li', id:contains(~/.*ORDER_DETAILS_TAB/)) }
		tab{ $('div', id:contains(~/.*ORDER_DETAILS_TAB/)) }
		details{ module Grid, debugId:'ORDER_DETAILS_GRID'  }
	}
}
