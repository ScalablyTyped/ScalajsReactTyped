package typingsJapgolly.hastscript

import typingsJapgolly.hast.mod.Element
import typingsJapgolly.hast.mod.Root
import typingsJapgolly.hastscript.libCoreMod.HChild
import typingsJapgolly.hastscript.libCoreMod.HProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHtmlMod {
  
  object h {
    
    inline def apply(): Root = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Root]
    inline def apply(selector: String, children: HChild*): Element = ^.asInstanceOf[js.Dynamic].apply(scala.List(selector.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Element]
    inline def apply(selector: String, properties: Unit, children: HChild*): Element = (^.asInstanceOf[js.Dynamic].apply((scala.List(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
    inline def apply(selector: String, properties: HProperties, children: HChild*): Element = (^.asInstanceOf[js.Dynamic].apply((scala.List(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
    inline def apply(selector: Null, children: HChild*): Root = ^.asInstanceOf[js.Dynamic].apply(scala.List(selector.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Root]
    inline def apply(selector: Unit, children: HChild*): Root = ^.asInstanceOf[js.Dynamic].apply(scala.List(selector.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Root]
    
    @JSImport("hastscript/lib/html", "h")
    @js.native
    val ^ : js.Any = js.native
    
    object JSX {
      
      type Element = typingsJapgolly.hastscript.libJsxClassicMod.Element
      
      type ElementChildrenAttribute = typingsJapgolly.hastscript.libJsxClassicMod.ElementChildrenAttribute
      
      type IntrinsicAttributes = typingsJapgolly.hastscript.libJsxClassicMod.IntrinsicAttributes
      
      type IntrinsicElements = typingsJapgolly.hastscript.libJsxClassicMod.IntrinsicElements
    }
  }
  
  type Child = HChild
  
  type Properties = HProperties
}
