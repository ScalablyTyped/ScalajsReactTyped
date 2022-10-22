package typingsJapgolly.canvg.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.anon.A1
import typingsJapgolly.canvg.anon.ControlPoint
import typingsJapgolly.canvg.anon.Current
import typingsJapgolly.canvg.anon.CurrentPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg", "PathElement")
@js.native
open class PathElement protected ()
  extends typingsJapgolly.canvg.distDocumentMod.PathElement {
  def this(document: typingsJapgolly.canvg.distDocumentDocumentMod.Document) = this()
  def this(document: typingsJapgolly.canvg.distDocumentDocumentMod.Document, node: HTMLElement) = this()
  def this(
    document: typingsJapgolly.canvg.distDocumentDocumentMod.Document,
    node: HTMLElement,
    captureTextNodes: Boolean
  ) = this()
  def this(
    document: typingsJapgolly.canvg.distDocumentDocumentMod.Document,
    node: Unit,
    captureTextNodes: Boolean
  ) = this()
}
/* static members */
object PathElement {
  
  @JSImport("canvg", "PathElement")
  @js.native
  val ^ : js.Any = js.native
  
  inline def pathA(pathParser: typingsJapgolly.canvg.distPathParserMod.PathParser): A1 = ^.asInstanceOf[js.Dynamic].applyDynamic("pathA")(pathParser.asInstanceOf[js.Any]).asInstanceOf[A1]
  
  inline def pathC(pathParser: typingsJapgolly.canvg.distPathParserMod.PathParser): ControlPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("pathC")(pathParser.asInstanceOf[js.Any]).asInstanceOf[ControlPoint]
  
  inline def pathH(pathParser: typingsJapgolly.canvg.distPathParserMod.PathParser): Current = ^.asInstanceOf[js.Dynamic].applyDynamic("pathH")(pathParser.asInstanceOf[js.Any]).asInstanceOf[Current]
  
  inline def pathL(pathParser: typingsJapgolly.canvg.distPathParserMod.PathParser): Current = ^.asInstanceOf[js.Dynamic].applyDynamic("pathL")(pathParser.asInstanceOf[js.Any]).asInstanceOf[Current]
  
  inline def pathM(pathParser: typingsJapgolly.canvg.distPathParserMod.PathParser): typingsJapgolly.canvg.anon.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("pathM")(pathParser.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.canvg.anon.Point]
  
  inline def pathQ(pathParser: typingsJapgolly.canvg.distPathParserMod.PathParser): CurrentPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("pathQ")(pathParser.asInstanceOf[js.Any]).asInstanceOf[CurrentPoint]
  
  inline def pathS(pathParser: typingsJapgolly.canvg.distPathParserMod.PathParser): ControlPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("pathS")(pathParser.asInstanceOf[js.Any]).asInstanceOf[ControlPoint]
  
  inline def pathT(pathParser: typingsJapgolly.canvg.distPathParserMod.PathParser): CurrentPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("pathT")(pathParser.asInstanceOf[js.Any]).asInstanceOf[CurrentPoint]
  
  inline def pathV(pathParser: typingsJapgolly.canvg.distPathParserMod.PathParser): Current = ^.asInstanceOf[js.Dynamic].applyDynamic("pathV")(pathParser.asInstanceOf[js.Any]).asInstanceOf[Current]
  
  inline def pathZ(pathParser: typingsJapgolly.canvg.distPathParserMod.PathParser): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pathZ")(pathParser.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
