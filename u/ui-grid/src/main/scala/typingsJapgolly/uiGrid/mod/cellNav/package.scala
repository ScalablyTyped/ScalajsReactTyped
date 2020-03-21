package typingsJapgolly.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cellNav {
  type navigateHandler[TEntity] = js.Function2[
    /* newRowCol */ typingsJapgolly.uiGrid.mod.cellNav.IRowCol[TEntity], 
    /* oldRowCol */ typingsJapgolly.uiGrid.mod.cellNav.IRowCol[TEntity], 
    scala.Unit
  ]
  type viewportKeyDownHandler[TEntity] = js.Function2[
    /* event */ typingsJapgolly.angular.JQueryKeyEventObject, 
    /* rowCol */ typingsJapgolly.uiGrid.mod.cellNav.IRowCol[TEntity], 
    scala.Unit
  ]
  type viewportKeyPressHandler[TEntity] = js.Function2[
    /* event */ typingsJapgolly.angular.JQueryKeyEventObject, 
    /* rowCol */ typingsJapgolly.uiGrid.mod.cellNav.IRowCol[TEntity], 
    scala.Unit
  ]
}
