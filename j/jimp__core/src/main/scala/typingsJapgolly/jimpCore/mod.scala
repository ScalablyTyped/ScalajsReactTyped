package typingsJapgolly.jimpCore

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.jimpCore.etcMod.Bitmap
import typingsJapgolly.jimpCore.etcMod.ImageCallback
import typingsJapgolly.jimpCore.etcMod.URLOptions
import typingsJapgolly.jimpCore.jimpMod.Jimp
import typingsJapgolly.jimpCore.jimpMod.JimpConstructors
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default protected () extends JimpConstructors {
    // For custom constructors when using Jimp.appendConstructorOption
    def this(args: js.Any*) = this()
    def this(data: Bitmap) = this()
    def this(data: Buffer) = this()
    def this(image: Jimp) = this()
    def this(path: String) = this()
    def this(urlOptions: URLOptions) = this()
    def this(data: Bitmap, cb: ImageCallback[JimpConstructors]) = this()
    def this(data: Buffer, cb: ImageCallback[JimpConstructors]) = this()
    def this(image: Jimp, cb: ImageCallback[JimpConstructors]) = this()
    def this(path: String, cb: ImageCallback[JimpConstructors]) = this()
    def this(urlOptions: URLOptions, cb: ImageCallback[JimpConstructors]) = this()
    def this(w: Double, h: Double) = this()
    def this(w: Double, h: Double, background: String) = this()
    def this(w: Double, h: Double, background: Double) = this()
    def this(w: Double, h: Double, cb: ImageCallback[JimpConstructors]) = this()
    def this(w: Double, h: Double, background: String, cb: ImageCallback[JimpConstructors]) = this()
    def this(w: Double, h: Double, background: Double, cb: ImageCallback[JimpConstructors]) = this()
  }
  
  def addConstants(constants: js.Tuple2[String, String | Double]): Unit = js.native
  def addConstants(constants: js.Tuple2[String, String | Double], jimpInstance: Jimp): Unit = js.native
  def addJimpMethods(methods: js.Tuple2[String, js.Function]): Unit = js.native
  def addJimpMethods(methods: js.Tuple2[String, js.Function], jimpInstance: Jimp): Unit = js.native
  def addType(mime: String, extensions: js.Array[String]): Unit = js.native
  def jimpEvChange(methodName: String, method: js.Function): Unit = js.native
  def jimpEvMethod(methodName: String, evName: String, method: js.Function): Unit = js.native
  @js.native
  object default extends TopLevel[Jimp]
  
}

