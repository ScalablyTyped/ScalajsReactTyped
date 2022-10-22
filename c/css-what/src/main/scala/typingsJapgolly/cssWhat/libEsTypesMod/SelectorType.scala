package typingsJapgolly.cssWhat.libEsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectorType extends StObject
@JSImport("css-what/lib/es/types", "SelectorType")
@js.native
object SelectorType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SelectorType & String] = js.native
  
  @js.native
  sealed trait Adjacent
    extends StObject
       with SelectorType
       with TraversalType
  /* "adjacent" */ val Adjacent: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Adjacent & String = js.native
  
  @js.native
  sealed trait Attribute
    extends StObject
       with SelectorType
  /* "attribute" */ val Attribute: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Attribute & String = js.native
  
  @js.native
  sealed trait Child
    extends StObject
       with SelectorType
       with TraversalType
  /* "child" */ val Child: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Child & String = js.native
  
  @js.native
  sealed trait ColumnCombinator
    extends StObject
       with SelectorType
       with TraversalType
  /* "column-combinator" */ val ColumnCombinator: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.ColumnCombinator & String = js.native
  
  @js.native
  sealed trait Descendant
    extends StObject
       with SelectorType
       with TraversalType
  /* "descendant" */ val Descendant: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Descendant & String = js.native
  
  @js.native
  sealed trait Parent
    extends StObject
       with SelectorType
       with TraversalType
  /* "parent" */ val Parent: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Parent & String = js.native
  
  @js.native
  sealed trait Pseudo
    extends StObject
       with SelectorType
  /* "pseudo" */ val Pseudo: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Pseudo & String = js.native
  
  @js.native
  sealed trait PseudoElement
    extends StObject
       with SelectorType
  /* "pseudo-element" */ val PseudoElement: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.PseudoElement & String = js.native
  
  @js.native
  sealed trait Sibling
    extends StObject
       with SelectorType
       with TraversalType
  /* "sibling" */ val Sibling: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Sibling & String = js.native
  
  @js.native
  sealed trait Tag
    extends StObject
       with SelectorType
  /* "tag" */ val Tag: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Tag & String = js.native
  
  @js.native
  sealed trait Universal
    extends StObject
       with SelectorType
  /* "universal" */ val Universal: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Universal & String = js.native
}
