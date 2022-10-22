package typingsJapgolly.handsontable

import org.scalajs.dom.HTMLTableCellElement
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.settingsMod.CellProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderersBaseMod {
  
  type BaseRenderer = js.Function7[
    /* instance */ default, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ Any, 
    /* cellProperties */ CellProperties, 
    Unit
  ]
}
