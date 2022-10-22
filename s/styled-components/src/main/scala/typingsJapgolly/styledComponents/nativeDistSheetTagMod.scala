package typingsJapgolly.styledComponents

import org.scalajs.dom.CSSStyleSheet
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLStyleElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.styledComponents.anon.DeleteRule
import typingsJapgolly.styledComponents.anon.Element
import typingsJapgolly.styledComponents.anon.GetRule
import typingsJapgolly.styledComponents.nativeDistSheetTypesMod.SheetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistSheetTagMod {
  
  @JSImport("styled-components/native/dist/sheet/Tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("styled-components/native/dist/sheet/Tag", "CSSOMTag")
  @js.native
  open class CSSOMTag ()
    extends StObject
       with DeleteRule {
    def this(target: HTMLElement) = this()
    
    /* CompleteClass */
    override def deleteRule(index: Double): Unit = js.native
    
    /* CompleteClass */
    var element: HTMLStyleElement = js.native
    
    /* CompleteClass */
    override def getRule(index: Double): String = js.native
    
    /* CompleteClass */
    override def insertRule(index: Double, rule: String): Boolean = js.native
    
    /* CompleteClass */
    var length: Double = js.native
    
    /* CompleteClass */
    var sheet: CSSStyleSheet = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("styled-components/native/dist/sheet/Tag", "TextTag")
  @js.native
  open class TextTag ()
    extends StObject
       with Element {
    def this(target: HTMLElement) = this()
    
    /* CompleteClass */
    override def deleteRule(index: Double): Unit = js.native
    
    /* CompleteClass */
    var element: HTMLStyleElement = js.native
    
    /* CompleteClass */
    override def getRule(index: Double): String = js.native
    
    /* CompleteClass */
    override def insertRule(index: Double, rule: String): Boolean = js.native
    
    /* CompleteClass */
    var length: Double = js.native
    
    /* CompleteClass */
    var nodes: NodeList[Node] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("styled-components/native/dist/sheet/Tag", "VirtualTag")
  @js.native
  open class VirtualTag ()
    extends StObject
       with GetRule {
    def this(_target: HTMLElement) = this()
    
    /* CompleteClass */
    override def deleteRule(index: Double): Unit = js.native
    
    /* CompleteClass */
    override def getRule(index: Double): String = js.native
    
    /* CompleteClass */
    override def insertRule(index: Double, rule: String): Boolean = js.native
    
    /* CompleteClass */
    var length: Double = js.native
    
    /* CompleteClass */
    var rules: js.Array[String] = js.native
  }
  
  inline def makeTag(hasIsServerUseCSSOMInjectionTarget: SheetOptions): DeleteRule | Element | GetRule = ^.asInstanceOf[js.Dynamic].applyDynamic("makeTag")(hasIsServerUseCSSOMInjectionTarget.asInstanceOf[js.Any]).asInstanceOf[DeleteRule | Element | GetRule]
}
