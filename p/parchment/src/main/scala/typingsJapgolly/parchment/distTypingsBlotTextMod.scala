package typingsJapgolly.parchment

import org.scalajs.dom.Node
import org.scalajs.dom.Text
import typingsJapgolly.parchment.distTypingsBlotAbstractBlotMod.Root
import typingsJapgolly.parchment.distTypingsScopeMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsBlotTextMod {
  
  @JSImport("parchment/dist/typings/blot/text", JSImport.Default)
  @js.native
  open class default protected () extends TextBlot {
    def this(scroll: Root, node: Node) = this()
  }
  object default {
    
    @JSImport("parchment/dist/typings/blot/text", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/text", "default.blotName")
    @js.native
    def blotName: String = js.native
    inline def blotName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blotName")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def create(value: String): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[Text]
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/text", "default.scope")
    @js.native
    def scope: Scope = js.native
    inline def scope_=(x: Scope): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def value(domNode: Text): String = ^.asInstanceOf[js.Dynamic].applyDynamic("value")(domNode.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @js.native
  trait TextBlot
    extends typingsJapgolly.parchment.distTypingsBlotAbstractLeafMod.default {
    
    @JSName("domNode")
    var domNode_TextBlot: Text = js.native
    
    /* protected */ var text: String = js.native
  }
}
