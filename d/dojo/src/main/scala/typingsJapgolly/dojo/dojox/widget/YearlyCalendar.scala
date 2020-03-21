package typingsJapgolly.dojo.dojox.widget

import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dojoStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/YearlyCalendar.html
  *
  * A calendar with only a year view.
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.dojo.dojox.widget.CalendarYear because Inheritance from two classes. Inlined parent */ @JSGlobal("dojox.widget.YearlyCalendar")
@js.native
class YearlyCalendar () extends CalendarBase {
  /**
    *
    */
  var parent: js.Object = js.native
  @JSName("get")
  def get_parent(property: parent): js.Object = js.native
  @JSName("set")
  def set_parent(property: parent, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_parent(
    property: parent,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

