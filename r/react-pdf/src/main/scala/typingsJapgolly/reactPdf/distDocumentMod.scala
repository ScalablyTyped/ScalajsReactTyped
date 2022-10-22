package typingsJapgolly.reactPdf

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.pdfjsDist.typesSrcDisplayApiMod.PDFDocumentProxy
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactPdf.anon.PageNumber
import typingsJapgolly.reactPdf.reactPdfStrings._blank
import typingsJapgolly.reactPdf.reactPdfStrings._parent
import typingsJapgolly.reactPdf.reactPdfStrings._self
import typingsJapgolly.reactPdf.reactPdfStrings._top
import typingsJapgolly.reactPdf.reactPdfStrings.canvas
import typingsJapgolly.reactPdf.reactPdfStrings.none
import typingsJapgolly.reactPdf.reactPdfStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentMod {
  
  @JSImport("react-pdf/dist/Document", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  
  type Document = japgolly.scalajs.react.facade.React.Component[Props & js.Object, js.Object]
  
  trait LoadingProcessData extends StObject {
    
    var loaded: Double
    
    var total: Double
  }
  object LoadingProcessData {
    
    inline def apply(loaded: Double, total: Double): LoadingProcessData = {
      val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadingProcessData]
    }
    
    extension [Self <: LoadingProcessData](x: Self) {
      
      inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Defines custom class name(s), that will be added to rendered element.
      * @default 'react-pdf__Document'
      */
    var className: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Defines what the component should display in case of an error.
      * @default 'Failed to load PDF file.'
      */
    var error: js.UndefOr[String | Element | RenderFunction] = js.undefined
    
    /**
      * Defines link target for external links rendered in annotations.
      * Defaults to unset, which means that default behavior will be used.
      */
    var externalLinkTarget: js.UndefOr[_self | _blank | _parent | _top] = js.undefined
    
    /**
      * Defines what PDF should be displayed.
      * Its value can be an URL,
      * a file (imported using import ... from ... or from file input form element),
      * or an object with parameters
      *  (
      *   url - URL;
      *   data - data, preferably Uint8Array;
      *   range - PDFDataRangeTransport;
      *   httpHeaders - custom request headers, e.g. for authorization
      *   withCredentials - a boolean to indicate whether or not to include cookies in the request (defaults to false)
      *  )
      */
    var file: Any
    
    /**
      * The path used to prefix the src attributes of annotation SVGs.
      */
    var imageResourcesPath: js.UndefOr[String] = js.undefined
    
    /**
      * A function that behaves like ref,
      * but it's passed to main `<div>` rendered by `<Document>` component.
      */
    var inputRef: js.UndefOr[LegacyRef[HTMLDivElement]] = js.undefined
    
    /**
      * Defines what the component should display while loading.
      * @default 'Loading PDF…'
      */
    var loading: js.UndefOr[String | Element | RenderFunction] = js.undefined
    
    /**
      * Defines what the component should display in case of no data.
      * @default 'No PDF file specified.'
      */
    var noData: js.UndefOr[String | Element | RenderFunction] = js.undefined
    
    /**
      * Function called when an outline item has been clicked.
      * Usually, you would like to use this callback to move the user wherever they requested to.
      */
    var onItemClick: js.UndefOr[js.Function1[/* hasPageNumber */ PageNumber, Unit]] = js.undefined
    
    /**
      * Function called in case of an error while loading a document.
      */
    var onLoadError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    /**
      * Function called, potentially multiple times, as the loading progresses.
      */
    var onLoadProgress: js.UndefOr[js.Function1[/* data */ LoadingProcessData, Unit]] = js.undefined
    
    /**
      * Function called when the document is successfully loaded.
      */
    var onLoadSuccess: js.UndefOr[js.Function1[/* pdf */ PDFDocumentProxy, Unit]] = js.undefined
    
    /**
      * Function called when a password-protected PDF is loaded.
      * Defaults to a function that prompts the user for password.
      */
    var onPassword: js.UndefOr[
        js.Function2[/* callback */ js.Function1[/* password */ String, Unit], /* reason */ String, Unit]
      ] = js.undefined
    
    /**
      * Function called in case of an error while retrieving document source from `file` prop.
      */
    var onSourceError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    /**
      * Function called when document source is successfully retrieved from `file` prop.
      */
    var onSourceSuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * An object in which additional parameters to be passed to PDF.js can be defined.
      * For a full list of possible parameters, check PDF.js documentation on DocumentInitParameters.
      */
    var options: js.UndefOr[Any] = js.undefined
    
    /**
      * Defines the rendering mode of the document.
      * @default 'canvas'
      */
    var renderMode: js.UndefOr[canvas | svg | none] = js.undefined
    
    /**
      * Defines the rotation of the document in degrees.
      * If provided, will change rotation globally,
      * even for the pages which were given rotate prop of their own.
      * 90 = rotated to the right, 180 = upside down, 270 = rotated to the left.
      */
    var rotate: js.UndefOr[Double] = js.undefined
  }
  object Props {
    
    inline def apply(file: Any): Props = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String | js.Array[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNameVarargs(value: String*): Self = StObject.set(x, "className", js.Array(value*))
      
      inline def setError(value: String | Element | RenderFunction): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorCallbackTo(value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): Self = StObject.set(x, "error", value.toJsFn)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setErrorVdomElement(value: VdomElement): Self = StObject.set(x, "error", value.rawElement.asInstanceOf[js.Any])
      
      inline def setExternalLinkTarget(value: _self | _blank | _parent | _top): Self = StObject.set(x, "externalLinkTarget", value.asInstanceOf[js.Any])
      
      inline def setExternalLinkTargetUndefined: Self = StObject.set(x, "externalLinkTarget", js.undefined)
      
      inline def setFile(value: Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setImageResourcesPath(value: String): Self = StObject.set(x, "imageResourcesPath", value.asInstanceOf[js.Any])
      
      inline def setImageResourcesPathUndefined: Self = StObject.set(x, "imageResourcesPath", js.undefined)
      
      inline def setInputRef(value: LegacyRef[HTMLDivElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "inputRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setLoading(value: String | Element | RenderFunction): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingCallbackTo(value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): Self = StObject.set(x, "loading", value.toJsFn)
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setLoadingVdomElement(value: VdomElement): Self = StObject.set(x, "loading", value.rawElement.asInstanceOf[js.Any])
      
      inline def setNoData(value: String | Element | RenderFunction): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
      
      inline def setNoDataCallbackTo(value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): Self = StObject.set(x, "noData", value.toJsFn)
      
      inline def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
      
      inline def setNoDataVdomElement(value: VdomElement): Self = StObject.set(x, "noData", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnItemClick(value: /* hasPageNumber */ PageNumber => Callback): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1((t0: /* hasPageNumber */ PageNumber) => value(t0).runNow()))
      
      inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      inline def setOnLoadError(value: /* error */ js.Error => Callback): Self = StObject.set(x, "onLoadError", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
      
      inline def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
      
      inline def setOnLoadProgress(value: /* data */ LoadingProcessData => Callback): Self = StObject.set(x, "onLoadProgress", js.Any.fromFunction1((t0: /* data */ LoadingProcessData) => value(t0).runNow()))
      
      inline def setOnLoadProgressUndefined: Self = StObject.set(x, "onLoadProgress", js.undefined)
      
      inline def setOnLoadSuccess(value: /* pdf */ PDFDocumentProxy => Callback): Self = StObject.set(x, "onLoadSuccess", js.Any.fromFunction1((t0: /* pdf */ PDFDocumentProxy) => value(t0).runNow()))
      
      inline def setOnLoadSuccessUndefined: Self = StObject.set(x, "onLoadSuccess", js.undefined)
      
      inline def setOnPassword(value: (/* callback */ js.Function1[/* password */ String, Unit], /* reason */ String) => Callback): Self = StObject.set(x, "onPassword", js.Any.fromFunction2((t0: /* callback */ js.Function1[/* password */ String, Unit], t1: /* reason */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnPasswordUndefined: Self = StObject.set(x, "onPassword", js.undefined)
      
      inline def setOnSourceError(value: /* error */ js.Error => Callback): Self = StObject.set(x, "onSourceError", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
      
      inline def setOnSourceErrorUndefined: Self = StObject.set(x, "onSourceError", js.undefined)
      
      inline def setOnSourceSuccess(value: Callback): Self = StObject.set(x, "onSourceSuccess", value.toJsFn)
      
      inline def setOnSourceSuccessUndefined: Self = StObject.set(x, "onSourceSuccess", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRenderMode(value: canvas | svg | none): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      inline def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    }
  }
  
  type RenderFunction = js.Function0[typingsJapgolly.react.mod.global.JSX.Element]
}
