package typingsJapgolly.tesseractJs.mod

import org.scalajs.dom.Blob
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.File
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.ImageData
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.tesseractJs.anon.PartialWorkerOptions
import typingsJapgolly.tesseractJs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createScheduler(): Scheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("createScheduler")().asInstanceOf[Scheduler]

inline def createWorker(): Worker = ^.asInstanceOf[js.Dynamic].applyDynamic("createWorker")().asInstanceOf[Worker]
inline def createWorker(options: PartialWorkerOptions): Worker = ^.asInstanceOf[js.Dynamic].applyDynamic("createWorker")(options.asInstanceOf[js.Any]).asInstanceOf[Worker]

inline def detect(image: ImageLike): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")(image.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def detect(image: ImageLike, options: PartialWorkerOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(image.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def recognize(image: ImageLike): js.Promise[RecognizeResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("recognize")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RecognizeResult]]
inline def recognize(image: ImageLike, langs: String): js.Promise[RecognizeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("recognize")(image.asInstanceOf[js.Any], langs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RecognizeResult]]
inline def recognize(image: ImageLike, langs: String, options: PartialWorkerOptions): js.Promise[RecognizeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("recognize")(image.asInstanceOf[js.Any], langs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RecognizeResult]]
inline def recognize(image: ImageLike, langs: Unit, options: PartialWorkerOptions): js.Promise[RecognizeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("recognize")(image.asInstanceOf[js.Any], langs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RecognizeResult]]

inline def setLogging(logging: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogging")(logging.asInstanceOf[js.Any]).asInstanceOf[Unit]

type ImageLike = String | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | CanvasRenderingContext2D | File | Blob | ImageData | Buffer
