package typingsJapgolly.qrcode

import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.qrcode.mod.QRCodeOptions
import typingsJapgolly.qrcode.mod.QRCodeRenderersOptions
import typingsJapgolly.qrcode.mod.QRCodeSegment
import typingsJapgolly.qrcode.mod.QRCodeToDataURLOptions
import typingsJapgolly.qrcode.mod.QRCodeToStringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildQrcodeMod {
  
  object global {
    
    object QRCode {
      
      @JSGlobal("QRCode")
      @js.native
      val ^ : js.Any = js.native
      
      /* was `typeof QRCodeLib.create` */
      inline def create(text: String): typingsJapgolly.qrcode.mod.QRCode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.qrcode.mod.QRCode]
      inline def create(text: String, options: QRCodeOptions): typingsJapgolly.qrcode.mod.QRCode = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.qrcode.mod.QRCode]
      inline def create(text: js.Array[QRCodeSegment]): typingsJapgolly.qrcode.mod.QRCode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.qrcode.mod.QRCode]
      inline def create(text: js.Array[QRCodeSegment], options: QRCodeOptions): typingsJapgolly.qrcode.mod.QRCode = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.qrcode.mod.QRCode]
      
      /* was `typeof QRCodeLib.toCanvas` */
      inline def toCanvas(canvasElement: HTMLCanvasElement, text: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      /* was `typeof QRCodeLib.toCanvas` */
      inline def toCanvas(
        canvasElement: HTMLCanvasElement,
        text: String,
        callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toCanvas(canvasElement: HTMLCanvasElement, text: String, options: QRCodeRenderersOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      /* was `typeof QRCodeLib.toCanvas` */
      inline def toCanvas(
        canvasElement: HTMLCanvasElement,
        text: String,
        options: QRCodeRenderersOptions,
        callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toCanvas(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def toCanvas(
        canvasElement: HTMLCanvasElement,
        text: js.Array[QRCodeSegment],
        callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toCanvas(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment], options: QRCodeRenderersOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def toCanvas(
        canvasElement: HTMLCanvasElement,
        text: js.Array[QRCodeSegment],
        options: QRCodeRenderersOptions,
        callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      /* was `typeof QRCodeLib.toCanvas` */
      inline def toCanvas(canvas: Any, text: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      /* was `typeof QRCodeLib.toCanvas` */
      inline def toCanvas(canvas: Any, text: String, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toCanvas(canvas: Any, text: String, options: QRCodeRenderersOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      /* was `typeof QRCodeLib.toCanvas` */
      inline def toCanvas(
        canvas: Any,
        text: String,
        options: QRCodeRenderersOptions,
        callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toCanvas(canvas: Any, text: js.Array[QRCodeSegment]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def toCanvas(
        canvas: Any,
        text: js.Array[QRCodeSegment],
        callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toCanvas(canvas: Any, text: js.Array[QRCodeSegment], options: QRCodeRenderersOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def toCanvas(
        canvas: Any,
        text: js.Array[QRCodeSegment],
        options: QRCodeRenderersOptions,
        callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      /* was `typeof QRCodeLib.toCanvas` */
      inline def toCanvas(text: String): js.Promise[HTMLCanvasElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLCanvasElement]]
      /* was `typeof QRCodeLib.toCanvas` */
      inline def toCanvas(
        text: String,
        callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* canvas */ HTMLCanvasElement, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toCanvas(text: String, options: QRCodeRenderersOptions): js.Promise[HTMLCanvasElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLCanvasElement]]
      /* was `typeof QRCodeLib.toCanvas` */
      inline def toCanvas(
        text: String,
        options: QRCodeRenderersOptions,
        callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* canvas */ HTMLCanvasElement, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toCanvas(text: js.Array[QRCodeSegment]): js.Promise[HTMLCanvasElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLCanvasElement]]
      inline def toCanvas(
        text: js.Array[QRCodeSegment],
        callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* canvas */ HTMLCanvasElement, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toCanvas(text: js.Array[QRCodeSegment], options: QRCodeRenderersOptions): js.Promise[HTMLCanvasElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLCanvasElement]]
      inline def toCanvas(
        text: js.Array[QRCodeSegment],
        options: QRCodeRenderersOptions,
        callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* canvas */ HTMLCanvasElement, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* was `typeof QRCodeLib.toDataURL` */
      inline def toDataURL(canvasElement: HTMLCanvasElement, text: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      /* was `typeof QRCodeLib.toDataURL` */
      inline def toDataURL(
        canvasElement: HTMLCanvasElement,
        text: String,
        callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* url */ String, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toDataURL(canvasElement: HTMLCanvasElement, text: String, options: QRCodeToDataURLOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      /* was `typeof QRCodeLib.toDataURL` */
      inline def toDataURL(
        canvasElement: HTMLCanvasElement,
        text: String,
        options: QRCodeToDataURLOptions,
        callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* url */ String, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toDataURL(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      inline def toDataURL(
        canvasElement: HTMLCanvasElement,
        text: js.Array[QRCodeSegment],
        callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* url */ String, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toDataURL(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment], options: QRCodeToDataURLOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      inline def toDataURL(
        canvasElement: HTMLCanvasElement,
        text: js.Array[QRCodeSegment],
        options: QRCodeToDataURLOptions,
        callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* url */ String, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      /* was `typeof QRCodeLib.toDataURL` */
      inline def toDataURL(text: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
      /* was `typeof QRCodeLib.toDataURL` */
      inline def toDataURL(
        text: String,
        callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* url */ String, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toDataURL(text: String, options: QRCodeToDataURLOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      /* was `typeof QRCodeLib.toDataURL` */
      inline def toDataURL(
        text: String,
        options: QRCodeToDataURLOptions,
        callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* url */ String, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toDataURL(text: js.Array[QRCodeSegment]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
      inline def toDataURL(
        text: js.Array[QRCodeSegment],
        callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* url */ String, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toDataURL(text: js.Array[QRCodeSegment], options: QRCodeToDataURLOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      inline def toDataURL(
        text: js.Array[QRCodeSegment],
        options: QRCodeToDataURLOptions,
        callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* url */ String, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* was `typeof QRCodeLib.toString` */
      inline def toString_(text: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
      /* was `typeof QRCodeLib.toString` */
      inline def toString_(
        text: String,
        callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* string */ String, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toString_(text: String, options: QRCodeToStringOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      /* was `typeof QRCodeLib.toString` */
      inline def toString_(
        text: String,
        options: QRCodeToStringOptions,
        callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* string */ String, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toString_(text: js.Array[QRCodeSegment]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
      inline def toString_(
        text: js.Array[QRCodeSegment],
        callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* string */ String, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toString_(text: js.Array[QRCodeSegment], options: QRCodeToStringOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      inline def toString_(
        text: js.Array[QRCodeSegment],
        options: QRCodeToStringOptions,
        callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* string */ String, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
