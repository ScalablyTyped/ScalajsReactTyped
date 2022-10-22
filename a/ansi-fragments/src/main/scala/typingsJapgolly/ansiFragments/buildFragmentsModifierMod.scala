package typingsJapgolly.ansiFragments

import typingsJapgolly.ansiFragments.buildFragmentsIfragmentMod.IFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFragmentsModifierMod {
  
  @JSImport("ansi-fragments/build/fragments/Modifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ansi-fragments/build/fragments/Modifier", "Modifier")
  @js.native
  open class Modifier_ protected ()
    extends StObject
       with IFragment {
    def this(ansiModifier: AnsiModifier, children: js.Array[String | IFragment]) = this()
    
    /* CompleteClass */
    override def build(): String = js.native
    
    /* private */ val children: Any = js.native
    
    /* private */ val modifier: Any = js.native
  }
  
  inline def modifier(ansiModifier: AnsiModifier, children: (String | IFragment)*): Modifier_ = ^.asInstanceOf[js.Dynamic].applyDynamic("modifier")(scala.List(ansiModifier.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Modifier_]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.dim
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.bold
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.hidden
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.italic
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.underline
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.strikethrough
    - typingsJapgolly.ansiFragments.ansiFragmentsStrings.none
  */
  trait AnsiModifier extends StObject
  object AnsiModifier {
    
    inline def bold: typingsJapgolly.ansiFragments.ansiFragmentsStrings.bold = "bold".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.bold]
    
    inline def dim: typingsJapgolly.ansiFragments.ansiFragmentsStrings.dim = "dim".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.dim]
    
    inline def hidden: typingsJapgolly.ansiFragments.ansiFragmentsStrings.hidden = "hidden".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.hidden]
    
    inline def italic: typingsJapgolly.ansiFragments.ansiFragmentsStrings.italic = "italic".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.italic]
    
    inline def none: typingsJapgolly.ansiFragments.ansiFragmentsStrings.none = "none".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.none]
    
    inline def strikethrough: typingsJapgolly.ansiFragments.ansiFragmentsStrings.strikethrough = "strikethrough".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.strikethrough]
    
    inline def underline: typingsJapgolly.ansiFragments.ansiFragmentsStrings.underline = "underline".asInstanceOf[typingsJapgolly.ansiFragments.ansiFragmentsStrings.underline]
  }
}
