package typingsJapgolly.jspdf.mod

import typingsJapgolly.jspdf.jspdfStrings.cm
import typingsJapgolly.jspdf.jspdfStrings.em
import typingsJapgolly.jspdf.jspdfStrings.ex
import typingsJapgolly.jspdf.jspdfStrings.in
import typingsJapgolly.jspdf.jspdfStrings.l
import typingsJapgolly.jspdf.jspdfStrings.landscape
import typingsJapgolly.jspdf.jspdfStrings.mm
import typingsJapgolly.jspdf.jspdfStrings.p
import typingsJapgolly.jspdf.jspdfStrings.pc
import typingsJapgolly.jspdf.jspdfStrings.portrait
import typingsJapgolly.jspdf.jspdfStrings.pt
import typingsJapgolly.jspdf.jspdfStrings.px
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jspdf", JSImport.Default)
@js.native
open class default () extends jsPDF {
  def this(options: jsPDFOptions) = this()
  def this(orientation: p | portrait | l | landscape) = this()
  def this(orientation: p | portrait | l | landscape, unit: pt | px | in | mm | cm | ex | em | pc) = this()
  def this(orientation: Unit, unit: pt | px | in | mm | cm | ex | em | pc) = this()
  def this(
    orientation: p | portrait | l | landscape,
    unit: pt | px | in | mm | cm | ex | em | pc,
    format: String
  ) = this()
  def this(
    orientation: p | portrait | l | landscape,
    unit: pt | px | in | mm | cm | ex | em | pc,
    format: js.Array[Double]
  ) = this()
  def this(orientation: p | portrait | l | landscape, unit: Unit, format: String) = this()
  def this(orientation: p | portrait | l | landscape, unit: Unit, format: js.Array[Double]) = this()
  def this(orientation: Unit, unit: pt | px | in | mm | cm | ex | em | pc, format: String) = this()
  def this(orientation: Unit, unit: pt | px | in | mm | cm | ex | em | pc, format: js.Array[Double]) = this()
  def this(orientation: Unit, unit: Unit, format: String) = this()
  def this(orientation: Unit, unit: Unit, format: js.Array[Double]) = this()
  def this(
    orientation: p | portrait | l | landscape,
    unit: pt | px | in | mm | cm | ex | em | pc,
    format: String,
    compressPdf: Boolean
  ) = this()
  def this(
    orientation: p | portrait | l | landscape,
    unit: pt | px | in | mm | cm | ex | em | pc,
    format: js.Array[Double],
    compressPdf: Boolean
  ) = this()
  def this(
    orientation: p | portrait | l | landscape,
    unit: pt | px | in | mm | cm | ex | em | pc,
    format: Unit,
    compressPdf: Boolean
  ) = this()
  def this(orientation: p | portrait | l | landscape, unit: Unit, format: String, compressPdf: Boolean) = this()
  def this(
    orientation: p | portrait | l | landscape,
    unit: Unit,
    format: js.Array[Double],
    compressPdf: Boolean
  ) = this()
  def this(orientation: p | portrait | l | landscape, unit: Unit, format: Unit, compressPdf: Boolean) = this()
  def this(
    orientation: Unit,
    unit: pt | px | in | mm | cm | ex | em | pc,
    format: String,
    compressPdf: Boolean
  ) = this()
  def this(
    orientation: Unit,
    unit: pt | px | in | mm | cm | ex | em | pc,
    format: js.Array[Double],
    compressPdf: Boolean
  ) = this()
  def this(orientation: Unit, unit: pt | px | in | mm | cm | ex | em | pc, format: Unit, compressPdf: Boolean) = this()
  def this(orientation: Unit, unit: Unit, format: String, compressPdf: Boolean) = this()
  def this(orientation: Unit, unit: Unit, format: js.Array[Double], compressPdf: Boolean) = this()
  def this(orientation: Unit, unit: Unit, format: Unit, compressPdf: Boolean) = this()
}
/* static members */
object default {
  
  @JSImport("jspdf", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jspdf", "default.API")
  @js.native
  def API: jsPDFAPI = js.native
  inline def API_=(x: jsPDFAPI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("API")(x.asInstanceOf[js.Any])
  
  @JSImport("jspdf", "default.version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
