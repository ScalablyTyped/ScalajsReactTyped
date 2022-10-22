package typingsJapgolly.go

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.SVGElement
import typingsJapgolly.go.mod.BrushLike
import typingsJapgolly.go.mod.GraphObject
import typingsJapgolly.go.mod.Iterable
import typingsJapgolly.go.mod.MarginLike
import typingsJapgolly.go.mod.Part
import typingsJapgolly.go.mod.Point
import typingsJapgolly.go.mod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Background extends StObject {
    
    var background: js.UndefOr[BrushLike] = js.undefined
    
    var details: js.UndefOr[Any] = js.undefined
    
    var document: js.UndefOr[org.scalajs.dom.Document] = js.undefined
    
    var maxSize: js.UndefOr[Size] = js.undefined
    
    var padding: js.UndefOr[MarginLike] = js.undefined
    
    var parts: js.UndefOr[Iterable[Part]] = js.undefined
    
    var position: js.UndefOr[Point] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var showGrid: js.UndefOr[Boolean] = js.undefined
    
    var showTemporary: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Background {
    
    inline def apply(): Background = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Background]
    }
    
    extension [Self <: Background](x: Self) {
      
      inline def setBackground(value: BrushLike): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setDetails(value: Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setDocument(value: org.scalajs.dom.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setMaxSize(value: Size): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setPadding(value: MarginLike): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setParts(value: Iterable[Part]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
      
      inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setShowGrid(value: Boolean): Self = StObject.set(x, "showGrid", value.asInstanceOf[js.Any])
      
      inline def setShowGridUndefined: Self = StObject.set(x, "showGrid", js.undefined)
      
      inline def setShowTemporary(value: Boolean): Self = StObject.set(x, "showTemporary", value.asInstanceOf[js.Any])
      
      inline def setShowTemporaryUndefined: Self = StObject.set(x, "showTemporary", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Document extends StObject {
    
    var background: js.UndefOr[BrushLike] = js.undefined
    
    var document: js.UndefOr[org.scalajs.dom.Document] = js.undefined
    
    var elementFinished: js.UndefOr[js.Function2[/* obj */ GraphObject, /* elt */ SVGElement, Unit]] = js.undefined
    
    var maxSize: js.UndefOr[Size] = js.undefined
    
    var padding: js.UndefOr[MarginLike] = js.undefined
    
    var parts: js.UndefOr[Iterable[Part]] = js.undefined
    
    var position: js.UndefOr[Point] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var showGrid: js.UndefOr[Boolean] = js.undefined
    
    var showTemporary: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
  }
  object Document {
    
    inline def apply(): Document = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Document]
    }
    
    extension [Self <: Document](x: Self) {
      
      inline def setBackground(value: BrushLike): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setDocument(value: org.scalajs.dom.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setElementFinished(value: (/* obj */ GraphObject, /* elt */ SVGElement) => Callback): Self = StObject.set(x, "elementFinished", js.Any.fromFunction2((t0: /* obj */ GraphObject, t1: /* elt */ SVGElement) => (value(t0, t1)).runNow()))
      
      inline def setElementFinishedUndefined: Self = StObject.set(x, "elementFinished", js.undefined)
      
      inline def setMaxSize(value: Size): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setPadding(value: MarginLike): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setParts(value: Iterable[Part]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
      
      inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setShowGrid(value: Boolean): Self = StObject.set(x, "showGrid", value.asInstanceOf[js.Any])
      
      inline def setShowGridUndefined: Self = StObject.set(x, "showGrid", js.undefined)
      
      inline def setShowTemporary(value: Boolean): Self = StObject.set(x, "showTemporary", value.asInstanceOf[js.Any])
      
      inline def setShowTemporaryUndefined: Self = StObject.set(x, "showTemporary", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait Random extends StObject {
    
    def random(): Double
  }
  object Random {
    
    inline def apply(random: CallbackTo[Double]): Random = {
      val __obj = js.Dynamic.literal(random = random.toJsFn)
      __obj.asInstanceOf[Random]
    }
    
    extension [Self <: Random](x: Self) {
      
      inline def setRandom(value: CallbackTo[Double]): Self = StObject.set(x, "random", value.toJsFn)
    }
  }
}
