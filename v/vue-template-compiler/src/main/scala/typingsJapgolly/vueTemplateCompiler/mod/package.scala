package typingsJapgolly.vueTemplateCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ASTElementHandlers = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.vueTemplateCompiler.mod.ASTElementHandler | js.Array[typingsJapgolly.vueTemplateCompiler.mod.ASTElementHandler]
  ]
  type ASTModifiers = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type DirectiveFunction = js.Function2[
    /* node */ typingsJapgolly.vueTemplateCompiler.mod.ASTElement, 
    /* directiveMeta */ typingsJapgolly.vueTemplateCompiler.mod.ASTDirective, 
    scala.Unit
  ]
}
