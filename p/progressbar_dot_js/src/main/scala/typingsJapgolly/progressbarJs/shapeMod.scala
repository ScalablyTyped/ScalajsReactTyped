package typingsJapgolly.progressbarJs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLParagraphElement
import org.scalajs.dom.SVGElement
import org.scalajs.dom.SVGPathElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shapeMod {
  
  // tslint:disable-next-line no-empty-interface adds members from animation contract
  @JSImport("progressbar.js/shape", JSImport.Namespace)
  @js.native
  /**
    * `Line`, `Circle` or `SemiCircle` shaped progress bar. Appends SVG to container.
    * @param container - Element where SVG is added.
    * @param [opts] - Options for path drawing.
    * @see {@link https://progressbarjs.readthedocs.io/en/latest/api/shape/#new-shapecontainer-options}
    */
  open class ^ ()
    extends StObject
       with Shape {
    def this(container: String) = this()
    def this(container: HTMLElement) = this()
    def this(
      container: String,
      opts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathDrawingOptions */ Any
    ) = this()
    def this(
      container: HTMLElement,
      opts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathDrawingOptions */ Any
    ) = this()
    def this(
      container: Null,
      opts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathDrawingOptions */ Any
    ) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * Reference to SVG path which presents the actual progress bar.
      */
    /* CompleteClass */
    override val path: SVGPathElement = js.native
    
    /* CompleteClass */
    override def setText(newText: String): Unit = js.native
    
    /**
      * Reference to SVG element where progress bar is drawn.
      */
    /* CompleteClass */
    override val svg: SVGElement = js.native
    
    /**
      * Reference to p element which presents the text label for progress bar.
      * Returns `null` if text is not defined.
      */
    /* CompleteClass */
    override val text: HTMLParagraphElement | Null = js.native
    
    /**
      * Reference to SVG path which presents the trail of the progress bar.
      * Returns `null` if trail is not defined.
      */
    /* CompleteClass */
    override val trail: SVGPathElement | Null = js.native
  }
  
  // tslint:disable-next-line no-empty-interface adds members from animation contract
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationSupport * / any */ trait Shape extends StObject {
    
    def destroy(): Unit
    
    /**
      * Reference to SVG path which presents the actual progress bar.
      */
    val path: SVGPathElement
    
    def setText(newText: String): Unit
    
    /**
      * Reference to SVG element where progress bar is drawn.
      */
    val svg: SVGElement
    
    /**
      * Reference to p element which presents the text label for progress bar.
      * Returns `null` if text is not defined.
      */
    val text: HTMLParagraphElement | Null
    
    /**
      * Reference to SVG path which presents the trail of the progress bar.
      * Returns `null` if trail is not defined.
      */
    val trail: SVGPathElement | Null
  }
  object Shape {
    
    inline def apply(destroy: Callback, path: SVGPathElement, setText: String => Callback, svg: SVGElement): Shape = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, path = path.asInstanceOf[js.Any], setText = js.Any.fromFunction1((t0: String) => setText(t0).runNow()), svg = svg.asInstanceOf[js.Any], text = null, trail = null)
      __obj.asInstanceOf[Shape]
    }
    
    extension [Self <: Shape](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setPath(value: SVGPathElement): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSetText(value: String => Callback): Self = StObject.set(x, "setText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSvg(value: SVGElement): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setText(value: HTMLParagraphElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTrail(value: SVGPathElement): Self = StObject.set(x, "trail", value.asInstanceOf[js.Any])
      
      inline def setTrailNull: Self = StObject.set(x, "trail", null)
    }
  }
}
