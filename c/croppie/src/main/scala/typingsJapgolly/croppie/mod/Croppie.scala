package typingsJapgolly.croppie.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.croppie.AnonOrientation
import typingsJapgolly.croppie.ResultOptionstypebase64ca
import typingsJapgolly.croppie.ResultOptionstypeblob
import typingsJapgolly.croppie.ResultOptionstypehtml
import typingsJapgolly.croppie.ResultOptionstyperawcanva
import typingsJapgolly.croppie.croppieNumbers.`-180`
import typingsJapgolly.croppie.croppieNumbers.`-270`
import typingsJapgolly.croppie.croppieNumbers.`-90`
import typingsJapgolly.croppie.croppieNumbers.`180`
import typingsJapgolly.croppie.croppieNumbers.`270`
import typingsJapgolly.croppie.croppieNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Croppie extends js.Object {
  def bind(options: AnonOrientation): js.Promise[Unit] = js.native
  def destroy(): Unit = js.native
  def get(): CropData = js.native
  def result(): js.Promise[HTMLCanvasElement] = js.native
  def result(options: ResultOptionstypebase64ca): js.Promise[String] = js.native
  def result(options: ResultOptionstypeblob): js.Promise[Blob] = js.native
  def result(options: ResultOptionstypehtml): js.Promise[HTMLElement] = js.native
  def result(options: ResultOptionstyperawcanva): js.Promise[HTMLCanvasElement] = js.native
  def result(options: ResultOptions): js.Promise[HTMLCanvasElement] = js.native
  @JSName("rotate")
  def rotate_180(degrees: `-180`): Unit = js.native
  @JSName("rotate")
  def rotate_180(degrees: `180`): Unit = js.native
  @JSName("rotate")
  def rotate_270(degrees: `-270`): Unit = js.native
  @JSName("rotate")
  def rotate_270(degrees: `270`): Unit = js.native
  @JSName("rotate")
  def rotate_90(degrees: `-90`): Unit = js.native
  @JSName("rotate")
  def rotate_90(degrees: `90`): Unit = js.native
  def setZoom(zoom: Double): Unit = js.native
}

