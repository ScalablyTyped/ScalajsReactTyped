package typingsJapgolly.reactMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMarkdown.reactMarkdownStrings.left
    - typingsJapgolly.reactMarkdown.reactMarkdownStrings.right
    - typingsJapgolly.reactMarkdown.reactMarkdownStrings.center
    - scala.Null
  */
  type AlignType = typingsJapgolly.reactMarkdown.mod._AlignType | scala.Null
  type LinkTargetResolver = js.Function3[
    /* uri */ java.lang.String, 
    /* text */ java.lang.String, 
    /* title */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type MdastPlugin = js.Function2[
    /* node */ typingsJapgolly.reactMarkdown.mod.MarkdownAbstractSyntaxTree, 
    /* renderProps */ js.UndefOr[typingsJapgolly.reactMarkdown.mod.RenderProps], 
    typingsJapgolly.reactMarkdown.mod.MarkdownAbstractSyntaxTree
  ]
  type ReactMarkdown = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactMarkdown.mod.ReactMarkdownProps with js.Object, js.Object]
  type Renderer[T] = js.Function1[/* props */ T, japgolly.scalajs.react.raw.React.Element]
  type Renderers_ = org.scalablytyped.runtime.StringDictionary[java.lang.String | typingsJapgolly.reactMarkdown.mod.Renderer[js.Any]]
}
