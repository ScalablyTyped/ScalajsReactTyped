package typingsJapgolly.canvg

import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.anon.A1
import typingsJapgolly.canvg.anon.ControlPoint
import typingsJapgolly.canvg.anon.Current
import typingsJapgolly.canvg.anon.CurrentPoint
import typingsJapgolly.canvg.anon.Point
import typingsJapgolly.canvg.distBoundingBoxMod.BoundingBox
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import typingsJapgolly.canvg.distDocumentRenderedElementMod.RenderedElement
import typingsJapgolly.canvg.distPathParserMod.PathParser
import typingsJapgolly.canvg.distTypesMod.RenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentPathElementMod {
  
  @JSImport("canvg/dist/Document/PathElement", "PathElement")
  @js.native
  open class PathElement protected () extends RenderedElement {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    
    def getBoundingBox(_ctx: RenderingContext2D): BoundingBox = js.native
    
    def getMarkers(): js.Array[Marker] = js.native
    
    def path(): BoundingBox = js.native
    def path(ctx: RenderingContext2D): BoundingBox = js.native
    
    /* protected */ def pathA(ctx: Unit, boundingBox: BoundingBox): Unit = js.native
    /* protected */ def pathA(ctx: RenderingContext2D, boundingBox: BoundingBox): Unit = js.native
    
    /* protected */ def pathC(ctx: Unit, boundingBox: BoundingBox): Unit = js.native
    /* protected */ def pathC(ctx: RenderingContext2D, boundingBox: BoundingBox): Unit = js.native
    
    /* protected */ def pathH(ctx: Unit, boundingBox: BoundingBox): Unit = js.native
    /* protected */ def pathH(ctx: RenderingContext2D, boundingBox: BoundingBox): Unit = js.native
    
    /* protected */ def pathL(ctx: Unit, boundingBox: BoundingBox): Unit = js.native
    /* protected */ def pathL(ctx: RenderingContext2D, boundingBox: BoundingBox): Unit = js.native
    
    /* protected */ def pathM(ctx: Unit, boundingBox: BoundingBox): Unit = js.native
    /* protected */ def pathM(ctx: RenderingContext2D, boundingBox: BoundingBox): Unit = js.native
    
    val pathParser: PathParser = js.native
    
    /* protected */ def pathQ(ctx: Unit, boundingBox: BoundingBox): Unit = js.native
    /* protected */ def pathQ(ctx: RenderingContext2D, boundingBox: BoundingBox): Unit = js.native
    
    /* protected */ def pathS(ctx: Unit, boundingBox: BoundingBox): Unit = js.native
    /* protected */ def pathS(ctx: RenderingContext2D, boundingBox: BoundingBox): Unit = js.native
    
    /* protected */ def pathT(ctx: Unit, boundingBox: BoundingBox): Unit = js.native
    /* protected */ def pathT(ctx: RenderingContext2D, boundingBox: BoundingBox): Unit = js.native
    
    /* protected */ def pathV(ctx: Unit, boundingBox: BoundingBox): Unit = js.native
    /* protected */ def pathV(ctx: RenderingContext2D, boundingBox: BoundingBox): Unit = js.native
    
    /* protected */ def pathZ(ctx: Unit, boundingBox: BoundingBox): Unit = js.native
    /* protected */ def pathZ(ctx: RenderingContext2D, boundingBox: BoundingBox): Unit = js.native
  }
  /* static members */
  object PathElement {
    
    @JSImport("canvg/dist/Document/PathElement", "PathElement")
    @js.native
    val ^ : js.Any = js.native
    
    inline def pathA(pathParser: PathParser): A1 = ^.asInstanceOf[js.Dynamic].applyDynamic("pathA")(pathParser.asInstanceOf[js.Any]).asInstanceOf[A1]
    
    inline def pathC(pathParser: PathParser): ControlPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("pathC")(pathParser.asInstanceOf[js.Any]).asInstanceOf[ControlPoint]
    
    inline def pathH(pathParser: PathParser): Current = ^.asInstanceOf[js.Dynamic].applyDynamic("pathH")(pathParser.asInstanceOf[js.Any]).asInstanceOf[Current]
    
    inline def pathL(pathParser: PathParser): Current = ^.asInstanceOf[js.Dynamic].applyDynamic("pathL")(pathParser.asInstanceOf[js.Any]).asInstanceOf[Current]
    
    inline def pathM(pathParser: PathParser): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("pathM")(pathParser.asInstanceOf[js.Any]).asInstanceOf[Point]
    
    inline def pathQ(pathParser: PathParser): CurrentPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("pathQ")(pathParser.asInstanceOf[js.Any]).asInstanceOf[CurrentPoint]
    
    inline def pathS(pathParser: PathParser): ControlPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("pathS")(pathParser.asInstanceOf[js.Any]).asInstanceOf[ControlPoint]
    
    inline def pathT(pathParser: PathParser): CurrentPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("pathT")(pathParser.asInstanceOf[js.Any]).asInstanceOf[CurrentPoint]
    
    inline def pathV(pathParser: PathParser): Current = ^.asInstanceOf[js.Dynamic].applyDynamic("pathV")(pathParser.asInstanceOf[js.Any]).asInstanceOf[Current]
    
    inline def pathZ(pathParser: PathParser): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pathZ")(pathParser.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  type Marker = js.Tuple2[typingsJapgolly.canvg.distPointMod.Point, Double]
}
