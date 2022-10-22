package typingsJapgolly.reactSyntaxHighlighter.components

import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactSyntaxHighlighter.lineNumberStyleFunction
import typingsJapgolly.reactSyntaxHighlighter.lineTagPropsFunction
import typingsJapgolly.reactSyntaxHighlighter.rendererProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_SyntaxHighlighterProps747756637[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def CodeTag(
    value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typingsJapgolly.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.a, typingsJapgolly.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.abbr, typingsJapgolly.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.address */ Any
  ): this.type = set("CodeTag", value.asInstanceOf[js.Any])
  
  inline def PreTag(
    value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typingsJapgolly.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.a, typingsJapgolly.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.abbr, typingsJapgolly.reactSyntaxHighlighter.reactSyntaxHighlighterStrings.address */ Any
  ): this.type = set("PreTag", value.asInstanceOf[js.Any])
  
  inline def codeTagProps(value: HTMLProps[HTMLElement]): this.type = set("codeTagProps", value.asInstanceOf[js.Any])
  
  inline def customStyle(value: CSSProperties): this.type = set("customStyle", value.asInstanceOf[js.Any])
  
  inline def language(value: String): this.type = set("language", value.asInstanceOf[js.Any])
  
  inline def lineNumberContainerStyle(value: CSSProperties): this.type = set("lineNumberContainerStyle", value.asInstanceOf[js.Any])
  
  inline def lineNumberStyle(value: CSSProperties | lineNumberStyleFunction): this.type = set("lineNumberStyle", value.asInstanceOf[js.Any])
  
  inline def lineNumberStyleFunction1(value: /* lineNumber */ Double => CSSProperties): this.type = set("lineNumberStyle", js.Any.fromFunction1(value))
  
  inline def lineProps(value: lineTagPropsFunction | HTMLProps[HTMLElement]): this.type = set("lineProps", value.asInstanceOf[js.Any])
  
  inline def linePropsFunction1(value: /* lineNumber */ Double => HTMLProps[HTMLElement]): this.type = set("lineProps", js.Any.fromFunction1(value))
  
  inline def renderer(value: /* props */ rendererProps => Node): this.type = set("renderer", js.Any.fromFunction1(value))
  
  inline def showInlineLineNumbers(value: Boolean): this.type = set("showInlineLineNumbers", value.asInstanceOf[js.Any])
  
  inline def showLineNumbers(value: Boolean): this.type = set("showLineNumbers", value.asInstanceOf[js.Any])
  
  inline def startingLineNumber(value: Double): this.type = set("startingLineNumber", value.asInstanceOf[js.Any])
  
  inline def useInlineStyles(value: Boolean): this.type = set("useInlineStyles", value.asInstanceOf[js.Any])
  
  inline def wrapLines(value: Boolean): this.type = set("wrapLines", value.asInstanceOf[js.Any])
  
  inline def wrapLongLines(value: Boolean): this.type = set("wrapLongLines", value.asInstanceOf[js.Any])
}
