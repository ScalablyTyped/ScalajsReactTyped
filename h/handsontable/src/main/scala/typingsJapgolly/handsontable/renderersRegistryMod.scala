package typingsJapgolly.handsontable

import org.scalajs.dom.HTMLTableCellElement
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.handsontableStrings.autocomplete
import typingsJapgolly.handsontable.handsontableStrings.base
import typingsJapgolly.handsontable.handsontableStrings.checkbox
import typingsJapgolly.handsontable.handsontableStrings.html
import typingsJapgolly.handsontable.handsontableStrings.numeric
import typingsJapgolly.handsontable.handsontableStrings.password
import typingsJapgolly.handsontable.handsontableStrings.text
import typingsJapgolly.handsontable.handsontableStrings.time
import typingsJapgolly.handsontable.renderersBaseMod.BaseRenderer
import typingsJapgolly.handsontable.settingsMod.CellProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderersRegistryMod {
  
  @JSImport("handsontable/renderers/registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRegisteredRendererNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredRendererNames")().asInstanceOf[js.Array[String]]
  
  inline def getRegisteredRenderers(): js.Array[BaseRenderer] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredRenderers")().asInstanceOf[js.Array[BaseRenderer]]
  
  inline def getRenderer(name: String): BaseRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderer")(name.asInstanceOf[js.Any]).asInstanceOf[BaseRenderer]
  
  inline def getRenderer_autocomplete(name: autocomplete): js.Function7[
    /* instance */ default, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ Any, 
    /* cellProperties */ CellProperties, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderer")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function7[
    /* instance */ default, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ Any, 
    /* cellProperties */ CellProperties, 
    Unit
  ]]
  
  inline def getRenderer_base(name: base): js.Function7[
    /* instance */ default, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ Any, 
    /* cellProperties */ CellProperties, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderer")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function7[
    /* instance */ default, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ Any, 
    /* cellProperties */ CellProperties, 
    Unit
  ]]
  
  inline def getRenderer_checkbox(name: checkbox): js.Function7[
    /* instance */ default, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ Any, 
    /* cellProperties */ CellProperties, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderer")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function7[
    /* instance */ default, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ Any, 
    /* cellProperties */ CellProperties, 
    Unit
  ]]
  
  inline def getRenderer_html(name: html): js.Function7[
    /* instance */ default, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ Any, 
    /* cellProperties */ CellProperties, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderer")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function7[
    /* instance */ default, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ Any, 
    /* cellProperties */ CellProperties, 
    Unit
  ]]
  
  inline def getRenderer_numeric(name: numeric): js.Function7[
    /* instance */ default, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ Any, 
    /* cellProperties */ CellProperties, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderer")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function7[
    /* instance */ default, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ Any, 
    /* cellProperties */ CellProperties, 
    Unit
  ]]
  
  inline def getRenderer_password(name: password): js.Function7[
    /* instance */ default, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ Any, 
    /* cellProperties */ CellProperties, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderer")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function7[
    /* instance */ default, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ Any, 
    /* cellProperties */ CellProperties, 
    Unit
  ]]
  
  inline def getRenderer_text(name: text): js.Function7[
    /* instance */ default, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ Any, 
    /* cellProperties */ CellProperties, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderer")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function7[
    /* instance */ default, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ Any, 
    /* cellProperties */ CellProperties, 
    Unit
  ]]
  
  inline def getRenderer_time(name: time): js.Function7[
    /* instance */ default, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ Any, 
    /* cellProperties */ CellProperties, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderer")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function7[
    /* instance */ default, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ Any, 
    /* cellProperties */ CellProperties, 
    Unit
  ]]
  
  inline def hasRenderer(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasRenderer")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def registerRenderer(name: String, renderer: BaseRenderer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRenderer")(name.asInstanceOf[js.Any], renderer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerRenderer(renderer: BaseRenderer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRenderer")(renderer.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
