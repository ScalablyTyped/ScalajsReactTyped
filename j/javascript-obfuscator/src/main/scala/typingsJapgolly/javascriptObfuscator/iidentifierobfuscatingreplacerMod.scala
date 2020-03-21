package typingsJapgolly.javascriptObfuscator

import typingsJapgolly.javascriptObfuscator.estreeMod.Identifier
import typingsJapgolly.javascriptObfuscator.iobfuscatingreplacerMod.IObfuscatingReplacer
import typingsJapgolly.javascriptObfuscator.tnodewithlexicalscopeMod.TNodeWithLexicalScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/interfaces/node-transformers/obfuscating-transformers/obfuscating-replacers/IIdentifierObfuscatingReplacer", JSImport.Namespace)
@js.native
object iidentifierobfuscatingreplacerMod extends js.Object {
  @js.native
  trait IIdentifierObfuscatingReplacer extends IObfuscatingReplacer[Identifier] {
    /**
      * @param {string} name
      */
    def preserveName(name: String): Unit = js.native
    /**
      * @param {string} nodeValue
      * @param {TNodeWithLexicalScope} lexicalScopeNode
      */
    def storeGlobalName(nodeValue: String, lexicalScopeNode: TNodeWithLexicalScope): Unit = js.native
    /**
      * @param {string} nodeValue
      * @param {TNodeWithLexicalScope} lexicalScopeNode
      */
    def storeLocalName(nodeValue: String, lexicalScopeNode: TNodeWithLexicalScope): Unit = js.native
  }
  
}

