package typingsJapgolly.next

import org.scalajs.dom.HTMLHtmlElement
import typingsJapgolly.next.anon.ReadonlyHtmlProps
import typingsJapgolly.next.distPagesDocumentMod.HeadProps
import typingsJapgolly.next.distPagesDocumentMod.OriginProps
import typingsJapgolly.next.distSharedLibHtmlContextMod.HtmlProps
import typingsJapgolly.next.distSharedLibUtilsMod.DocumentContext
import typingsJapgolly.next.distSharedLibUtilsMod.DocumentInitialProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HtmlHTMLAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentMod {
  
  @JSImport("next/document", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/document", JSImport.Default)
  @js.native
  open class default[P] ()
    extends typingsJapgolly.next.distPagesDocumentMod.default[P]
  /* static members */
  object default {
    
    @JSImport("next/document", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * `getInitialProps` hook returns the context object with the addition of `renderPage`.
      * `renderPage` callback executes `React` rendering logic synchronously to support server-rendering wrappers
      */
    inline def getInitialProps(ctx: DocumentContext): js.Promise[DocumentInitialProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialProps")(ctx.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DocumentInitialProps]]
  }
  
  @JSImport("next/document", "Head")
  @js.native
  open class Head protected ()
    extends typingsJapgolly.next.distPagesDocumentMod.Head {
    def this(props: HeadProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HeadProps, context: Any) = this()
  }
  /* static members */
  object Head {
    
    @JSImport("next/document", "Head")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/document", "Head.contextType")
    @js.native
    def contextType: Context[HtmlProps] = js.native
    inline def contextType_=(x: Context[HtmlProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  inline def Html(props: DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Html")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Main(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Main")().asInstanceOf[Element]
  
  @JSImport("next/document", "NextScript")
  @js.native
  open class NextScript protected ()
    extends typingsJapgolly.next.distPagesDocumentMod.NextScript {
    def this(props: OriginProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OriginProps, context: Any) = this()
  }
  /* static members */
  object NextScript {
    
    @JSImport("next/document", "NextScript")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/document", "NextScript.contextType")
    @js.native
    def contextType: Context[HtmlProps] = js.native
    inline def contextType_=(x: Context[HtmlProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    inline def getInlineScriptSource(context: ReadonlyHtmlProps): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInlineScriptSource")(context.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
