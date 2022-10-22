package typingsJapgolly.postcss

import typingsJapgolly.postcss.libNodeMod.AnyNode
import typingsJapgolly.postcss.libNodeMod.ChildNode
import typingsJapgolly.postcss.mod.AtRule_
import typingsJapgolly.postcss.mod.Builder
import typingsJapgolly.postcss.mod.Comment_
import typingsJapgolly.postcss.mod.Container
import typingsJapgolly.postcss.mod.Declaration
import typingsJapgolly.postcss.mod.Document
import typingsJapgolly.postcss.mod.Root_
import typingsJapgolly.postcss.mod.Rule_
import typingsJapgolly.postcss.postcssStrings.after
import typingsJapgolly.postcss.postcssStrings.before
import typingsJapgolly.postcss.postcssStrings.end
import typingsJapgolly.postcss.postcssStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStringifierMod {
  
  @JSImport("postcss/lib/stringifier", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Stringifier {
    def this(builder: Builder) = this()
  }
  
  @js.native
  trait Stringifier extends StObject {
    
    def atrule(node: AtRule_): Unit = js.native
    def atrule(node: AtRule_, semicolon: Boolean): Unit = js.native
    
    def beforeAfter(node: AnyNode, detect: before | after): String = js.native
    
    def block(node: AnyNode, start: String): Unit = js.native
    
    def body(node: Container[ChildNode]): Unit = js.native
    
    def builder(part: String): Unit = js.native
    def builder(part: String, node: Unit, `type`: start | end): Unit = js.native
    def builder(part: String, node: AnyNode): Unit = js.native
    def builder(part: String, node: AnyNode, `type`: start | end): Unit = js.native
    @JSName("builder")
    var builder_Original: Builder = js.native
    
    def comment(node: Comment_): Unit = js.native
    
    def decl(node: Declaration): Unit = js.native
    def decl(node: Declaration, semicolon: Boolean): Unit = js.native
    
    def document(node: Document): Unit = js.native
    
    def raw(node: AnyNode): String = js.native
    def raw(node: AnyNode, own: String): String = js.native
    def raw(node: AnyNode, own: String, detect: String): String = js.native
    def raw(node: AnyNode, own: Null, detect: String): String = js.native
    
    def rawBeforeClose(root: Root_): js.UndefOr[String] = js.native
    
    def rawBeforeComment(root: Root_, node: Comment_): js.UndefOr[String] = js.native
    
    def rawBeforeDecl(root: Root_, node: Declaration): js.UndefOr[String] = js.native
    
    def rawBeforeOpen(root: Root_): js.UndefOr[String] = js.native
    
    def rawBeforeRule(root: Root_): js.UndefOr[String] = js.native
    
    def rawColon(root: Root_): js.UndefOr[String] = js.native
    
    def rawEmptyBody(root: Root_): js.UndefOr[String] = js.native
    
    def rawIndent(root: Root_): js.UndefOr[String] = js.native
    
    def rawSemicolon(root: Root_): js.UndefOr[Boolean] = js.native
    
    def rawValue(node: AnyNode, prop: String): String = js.native
    
    def root(node: Root_): Unit = js.native
    
    def rule(node: Rule_): Unit = js.native
    
    def stringify(node: AnyNode): Unit = js.native
    def stringify(node: AnyNode, semicolon: Boolean): Unit = js.native
  }
}
