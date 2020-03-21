package typingsJapgolly.angularUiSortable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ui {
  type SortableEvent[T] = js.Function2[
    /* event */ typingsJapgolly.angular.JQueryEventObject, 
    /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T], 
    scala.Unit
  ]
  type SortableHelperFunctionOption = js.Function2[
    /* event */ typingsJapgolly.angular.JQueryEventObject, 
    /* ui */ typingsJapgolly.angular.mod.IAugmentedJQuery, 
    typingsJapgolly.angular.JQuery
  ]
}
