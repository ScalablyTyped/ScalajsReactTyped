package typingsJapgolly.cssWhat

import typingsJapgolly.cssWhat.cssWhatBooleans.`false`
import typingsJapgolly.cssWhat.cssWhatBooleans.`true`
import typingsJapgolly.cssWhat.cssWhatStrings.quirks
import typingsJapgolly.cssWhat.libEsTypesMod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-what", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("css-what", "AttributeAction")
  @js.native
  object AttributeAction extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.cssWhat.libEsTypesMod.AttributeAction & String] = js.native
    
    /* "any" */ val Any: typingsJapgolly.cssWhat.libEsTypesMod.AttributeAction.Any & String = js.native
    
    /* "element" */ val Element: typingsJapgolly.cssWhat.libEsTypesMod.AttributeAction.Element & String = js.native
    
    /* "end" */ val End: typingsJapgolly.cssWhat.libEsTypesMod.AttributeAction.End & String = js.native
    
    /* "equals" */ val Equals: typingsJapgolly.cssWhat.libEsTypesMod.AttributeAction.Equals & String = js.native
    
    /* "exists" */ val Exists: typingsJapgolly.cssWhat.libEsTypesMod.AttributeAction.Exists & String = js.native
    
    /* "hyphen" */ val Hyphen: typingsJapgolly.cssWhat.libEsTypesMod.AttributeAction.Hyphen & String = js.native
    
    /* "not" */ val Not: typingsJapgolly.cssWhat.libEsTypesMod.AttributeAction.Not & String = js.native
    
    /* "start" */ val Start: typingsJapgolly.cssWhat.libEsTypesMod.AttributeAction.Start & String = js.native
  }
  
  object IgnoreCaseMode {
    
    @JSImport("css-what", "IgnoreCaseMode.CaseSensitive")
    @js.native
    val CaseSensitive: `false` = js.native
    
    @JSImport("css-what", "IgnoreCaseMode.IgnoreCase")
    @js.native
    val IgnoreCase: `true` = js.native
    
    @JSImport("css-what", "IgnoreCaseMode.QuirksMode")
    @js.native
    val QuirksMode: quirks = js.native
    
    @JSImport("css-what", "IgnoreCaseMode.Unknown")
    @js.native
    val Unknown: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
  }
  
  @JSImport("css-what", "SelectorType")
  @js.native
  object SelectorType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.cssWhat.libEsTypesMod.SelectorType & String] = js.native
    
    /* "adjacent" */ val Adjacent: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Adjacent & String = js.native
    
    /* "attribute" */ val Attribute: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Attribute & String = js.native
    
    /* "child" */ val Child: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Child & String = js.native
    
    /* "column-combinator" */ val ColumnCombinator: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.ColumnCombinator & String = js.native
    
    /* "descendant" */ val Descendant: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Descendant & String = js.native
    
    /* "parent" */ val Parent: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Parent & String = js.native
    
    /* "pseudo" */ val Pseudo: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Pseudo & String = js.native
    
    /* "pseudo-element" */ val PseudoElement: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.PseudoElement & String = js.native
    
    /* "sibling" */ val Sibling: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Sibling & String = js.native
    
    /* "tag" */ val Tag: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Tag & String = js.native
    
    /* "universal" */ val Universal: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Universal & String = js.native
  }
  
  inline def isTraversal(selector: Selector): /* is css-what.css-what/lib/es/types.Traversal */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTraversal")(selector.asInstanceOf[js.Any]).asInstanceOf[/* is css-what.css-what/lib/es/types.Traversal */ Boolean]
  
  inline def parse(selector: String): js.Array[js.Array[Selector]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Selector]]]
  
  inline def stringify(selector: js.Array[js.Array[Selector]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(selector.asInstanceOf[js.Any]).asInstanceOf[String]
}
