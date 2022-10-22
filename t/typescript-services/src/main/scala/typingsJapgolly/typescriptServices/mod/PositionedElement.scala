package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PositionedElement")
@js.native
open class PositionedElement protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.PositionedElement {
  def this(
    parent: typingsJapgolly.typescriptServices.TypeScript.PositionedElement,
    element: ISyntaxElement,
    fullStart: Double
  ) = this()
  
  /* private */ /* CompleteClass */
  var _element: Any = js.native
  
  /* private */ /* CompleteClass */
  var _fullStart: Any = js.native
  
  /* private */ /* CompleteClass */
  var _parent: Any = js.native
  
  /* CompleteClass */
  override def childAt(index: Double): typingsJapgolly.typescriptServices.TypeScript.PositionedElement = js.native
  
  /* CompleteClass */
  override def childCount(): Double = js.native
  
  /* CompleteClass */
  override def childEnd(child: ISyntaxElement): Double = js.native
  
  /* CompleteClass */
  override def childEndAt(index: Double): Double = js.native
  
  /* CompleteClass */
  override def childIndex(child: ISyntaxElement): Double = js.native
  
  /* CompleteClass */
  override def childStart(child: ISyntaxElement): Double = js.native
  
  /* CompleteClass */
  override def childStartAt(index: Double): Double = js.native
  
  /* CompleteClass */
  override def containingNode(): typingsJapgolly.typescriptServices.TypeScript.PositionedNode = js.native
  
  /* CompleteClass */
  override def element(): ISyntaxElement = js.native
  
  /* CompleteClass */
  override def end(): Double = js.native
  
  /* CompleteClass */
  override def fullEnd(): Double = js.native
  
  /* CompleteClass */
  override def fullStart(): Double = js.native
  
  /* CompleteClass */
  override def fullWidth(): Double = js.native
  
  /* CompleteClass */
  override def getPositionedChild(child: ISyntaxElement): typingsJapgolly.typescriptServices.TypeScript.PositionedElement = js.native
  
  /* CompleteClass */
  override def kind(): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
  
  /* CompleteClass */
  override def parent(): typingsJapgolly.typescriptServices.TypeScript.PositionedElement = js.native
  
  /* CompleteClass */
  override def parentElement(): ISyntaxElement = js.native
  
  /* CompleteClass */
  override def root(): typingsJapgolly.typescriptServices.TypeScript.PositionedNode = js.native
  
  /* CompleteClass */
  override def start(): Double = js.native
}
object PositionedElement {
  
  @JSImport("typescript-services", "PositionedElement")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(
    parent: typingsJapgolly.typescriptServices.TypeScript.PositionedElement,
    element: ISyntaxElement,
    fullStart: Double
  ): typingsJapgolly.typescriptServices.TypeScript.PositionedElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], fullStart.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.PositionedElement]
}
