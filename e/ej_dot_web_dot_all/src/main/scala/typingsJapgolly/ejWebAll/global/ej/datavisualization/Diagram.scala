package typingsJapgolly.ejWebAll.global.ej.datavisualization

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import typingsJapgolly.ejWebAll.ej.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.datavisualization.Diagram")
@js.native
open class Diagram protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.datavisualization.Diagram {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: Model) = this()
  def this(element: JQuery, options: Model) = this()
}
object Diagram {
  
  @JSGlobal("ej.datavisualization.Diagram")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.datavisualization.Diagram.ActiveTool")
  @js.native
  object ActiveTool extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ActiveTool & Double] = js.native
    
    /* 1 */ val Drag: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ActiveTool.Drag & Double = js.native
    
    /* 2 */ val Draw: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ActiveTool.Draw & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ActiveTool.None & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.Alignment")
  @js.native
  object Alignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Alignment & Double] = js.native
    
    /* 2 */ val After: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Alignment.After & Double = js.native
    
    /* 0 */ val Before: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Alignment.Before & Double = js.native
    
    /* 1 */ val Center: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Alignment.Center & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.AssociationFlows")
  @js.native
  object AssociationFlows extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.AssociationFlows & Double] = js.native
    
    /* 2 */ val BiDirectional: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.AssociationFlows.BiDirectional & Double = js.native
    
    /* 0 */ val Default: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.AssociationFlows.Default & Double = js.native
    
    /* 1 */ val Directional: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.AssociationFlows.Directional & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.BPMNActivity")
  @js.native
  object BPMNActivity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNActivity & Double] = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNActivity.None & Double = js.native
    
    /* 2 */ val SubProcess: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNActivity.SubProcess & Double = js.native
    
    /* 1 */ val Task: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNActivity.Task & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.BPMNAnnotationDirection")
  @js.native
  object BPMNAnnotationDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNAnnotationDirection & Double
      ] = js.native
    
    /* 3 */ val Bottom: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNAnnotationDirection.Bottom & Double = js.native
    
    /* 0 */ val Left: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNAnnotationDirection.Left & Double = js.native
    
    /* 1 */ val Right: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNAnnotationDirection.Right & Double = js.native
    
    /* 2 */ val Top: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNAnnotationDirection.Top & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.BPMNBoundary")
  @js.native
  object BPMNBoundary extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNBoundary & Double] = js.native
    
    /* 1 */ val Call: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNBoundary.Call & Double = js.native
    
    /* 0 */ val Default: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNBoundary.Default & Double = js.native
    
    /* 2 */ val Event: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNBoundary.Event & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.BPMNDataObjects")
  @js.native
  object BPMNDataObjects extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNDataObjects & Double] = js.native
    
    /* 0 */ val Input: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNDataObjects.Input & Double = js.native
    
    /* 2 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNDataObjects.None & Double = js.native
    
    /* 1 */ val Output: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNDataObjects.Output & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.BPMNEvents")
  @js.native
  object BPMNEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNEvents & Double] = js.native
    
    /* 2 */ val End: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNEvents.End & Double = js.native
    
    /* 1 */ val Intermediate: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNEvents.Intermediate & Double = js.native
    
    /* 4 */ val NonInterruptingIntermediate: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNEvents.NonInterruptingIntermediate & Double = js.native
    
    /* 3 */ val NonInterruptingStart: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNEvents.NonInterruptingStart & Double = js.native
    
    /* 0 */ val Start: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNEvents.Start & Double = js.native
    
    /* 5 */ val ThrowingIntermediate: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNEvents.ThrowingIntermediate & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.BPMNFlows")
  @js.native
  object BPMNFlows extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNFlows & Double] = js.native
    
    /* 1 */ val Association: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNFlows.Association & Double = js.native
    
    /* 2 */ val Message: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNFlows.Message & Double = js.native
    
    /* 0 */ val Sequence: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNFlows.Sequence & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.BPMNGateways")
  @js.native
  object BPMNGateways extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNGateways & Double] = js.native
    
    /* 4 */ val Complex: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNGateways.Complex & Double = js.native
    
    /* 5 */ val EventBased: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNGateways.EventBased & Double = js.native
    
    /* 1 */ val Exclusive: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNGateways.Exclusive & Double = js.native
    
    /* 6 */ val ExclusiveEventBased: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNGateways.ExclusiveEventBased & Double = js.native
    
    /* 2 */ val Inclusive: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNGateways.Inclusive & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNGateways.None & Double = js.native
    
    /* 3 */ val Parallel: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNGateways.Parallel & Double = js.native
    
    /* 7 */ val ParallelEventBased: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNGateways.ParallelEventBased & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.BPMNLoops")
  @js.native
  object BPMNLoops extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNLoops & Double] = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNLoops.None & Double = js.native
    
    /* 2 */ val ParallelMultiInstance: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNLoops.ParallelMultiInstance & Double = js.native
    
    /* 3 */ val SequenceMultiInstance: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNLoops.SequenceMultiInstance & Double = js.native
    
    /* 1 */ val Standard: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNLoops.Standard & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.BPMNMessageFlows")
  @js.native
  object BPMNMessageFlows extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNMessageFlows & Double] = js.native
    
    /* 0 */ val Default: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNMessageFlows.Default & Double = js.native
    
    /* 1 */ val InitiatingMessage: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNMessageFlows.InitiatingMessage & Double = js.native
    
    /* 2 */ val NonInitiatingMessage: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNMessageFlows.NonInitiatingMessage & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.BPMNSequenceFlows")
  @js.native
  object BPMNSequenceFlows extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNSequenceFlows & Double] = js.native
    
    /* 1 */ val Conditional: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNSequenceFlows.Conditional & Double = js.native
    
    /* 2 */ val Default: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNSequenceFlows.Default & Double = js.native
    
    /* 0 */ val Normal: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNSequenceFlows.Normal & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.BPMNShapes")
  @js.native
  object BPMNShapes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNShapes & Double] = js.native
    
    /* 5 */ val Activity: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNShapes.Activity & Double = js.native
    
    /* 3 */ val DataObject: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNShapes.DataObject & Double = js.native
    
    /* 4 */ val DataSource: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNShapes.DataSource & Double = js.native
    
    /* 0 */ val Event: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNShapes.Event & Double = js.native
    
    /* 1 */ val Gateway: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNShapes.Gateway & Double = js.native
    
    /* 6 */ val Group: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNShapes.Group & Double = js.native
    
    /* 2 */ val Message: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNShapes.Message & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.BPMNSubProcessTypes")
  @js.native
  object BPMNSubProcessTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNSubProcessTypes & Double
      ] = js.native
    
    /* 2 */ val Event: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNSubProcessTypes.Event & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNSubProcessTypes.None & Double = js.native
    
    /* 1 */ val Transaction: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNSubProcessTypes.Transaction & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.BPMNTasks")
  @js.native
  object BPMNTasks extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTasks & Double] = js.native
    
    /* 6 */ val BusinessRule: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTasks.BusinessRule & Double = js.native
    
    /* 4 */ val InstantiatingReceive: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTasks.InstantiatingReceive & Double = js.native
    
    /* 5 */ val Manual: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTasks.Manual & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTasks.None & Double = js.native
    
    /* 9 */ val Parallel: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTasks.Parallel & Double = js.native
    
    /* 2 */ val Receive: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTasks.Receive & Double = js.native
    
    /* 8 */ val Script: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTasks.Script & Double = js.native
    
    /* 3 */ val Send: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTasks.Send & Double = js.native
    
    /* 1 */ val Service: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTasks.Service & Double = js.native
    
    /* 7 */ val User: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTasks.User & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.BPMNTriggers")
  @js.native
  object BPMNTriggers extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTriggers & Double] = js.native
    
    /* 12 */ val Cancel: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTriggers.Cancel & Double = js.native
    
    /* 6 */ val Compensation: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTriggers.Compensation & Double = js.native
    
    /* 10 */ val Conditional: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTriggers.Conditional & Double = js.native
    
    /* 5 */ val Error: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTriggers.Error & Double = js.native
    
    /* 3 */ val Escalation: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTriggers.Escalation & Double = js.native
    
    /* 4 */ val Link: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTriggers.Link & Double = js.native
    
    /* 1 */ val Message: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTriggers.Message & Double = js.native
    
    /* 8 */ val Multiple: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTriggers.Multiple & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTriggers.None & Double = js.native
    
    /* 9 */ val Parallel: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTriggers.Parallel & Double = js.native
    
    /* 7 */ val Signal: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTriggers.Signal & Double = js.native
    
    /* 11 */ val Terminate: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTriggers.Terminate & Double = js.native
    
    /* 2 */ val Timer: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BPMNTriggers.Timer & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.BasicShapes")
  @js.native
  object BasicShapes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BasicShapes & Double] = js.native
    
    /* 13 */ val Cylinder: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BasicShapes.Cylinder & Double = js.native
    
    /* 11 */ val Decagon: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BasicShapes.Decagon & Double = js.native
    
    /* 1 */ val Ellipse: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BasicShapes.Ellipse & Double = js.native
    
    /* 8 */ val Heptagon: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BasicShapes.Heptagon & Double = js.native
    
    /* 9 */ val Octagon: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BasicShapes.Octagon & Double = js.native
    
    /* 2 */ val Path: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BasicShapes.Path & Double = js.native
    
    /* 7 */ val Pentagon: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BasicShapes.Pentagon & Double = js.native
    
    /* 5 */ val Plus: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BasicShapes.Plus & Double = js.native
    
    /* 3 */ val Polygon: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BasicShapes.Polygon & Double = js.native
    
    /* 0 */ val Rectangle: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BasicShapes.Rectangle & Double = js.native
    
    /* 12 */ val RightTriangle: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BasicShapes.RightTriangle & Double = js.native
    
    /* 6 */ val Star: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BasicShapes.Star & Double = js.native
    
    /* 10 */ val Trapezoid: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BasicShapes.Trapezoid & Double = js.native
    
    /* 4 */ val Triangle: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BasicShapes.Triangle & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.BoundaryConstraints")
  @js.native
  object BoundaryConstraints extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BoundaryConstraints & Double
      ] = js.native
    
    /* 1 */ val Diagram: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BoundaryConstraints.Diagram & Double = js.native
    
    /* 0 */ val Infinite: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BoundaryConstraints.Infinite & Double = js.native
    
    /* 2 */ val Page: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BoundaryConstraints.Page & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.BridgeDirection")
  @js.native
  object BridgeDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BridgeDirection & Double] = js.native
    
    /* 3 */ val Bottom: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BridgeDirection.Bottom & Double = js.native
    
    /* 0 */ val Left: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BridgeDirection.Left & Double = js.native
    
    /* 1 */ val Right: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BridgeDirection.Right & Double = js.native
    
    /* 2 */ val Top: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.BridgeDirection.Top & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.ClassifierShapes")
  @js.native
  object ClassifierShapes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ClassifierShapes & Double] = js.native
    
    /* 4 */ val Aggregation: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ClassifierShapes.Aggregation & Double = js.native
    
    /* 3 */ val Association: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ClassifierShapes.Association & Double = js.native
    
    /* 0 */ val Class: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ClassifierShapes.Class & Double = js.native
    
    /* 5 */ val Composition: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ClassifierShapes.Composition & Double = js.native
    
    /* 6 */ val Dependency: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ClassifierShapes.Dependency & Double = js.native
    
    /* 2 */ val Enumeration: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ClassifierShapes.Enumeration & Double = js.native
    
    /* 7 */ val Inheritance: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ClassifierShapes.Inheritance & Double = js.native
    
    /* 1 */ val Interface: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ClassifierShapes.Interface & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.ConnectorConstraints")
  @js.native
  object ConnectorConstraints extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints & Double
      ] = js.native
    
    /* 10 */ val AllowDrop: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.AllowDrop & Double = js.native
    
    /* 16 */ val BridgeObstacle: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.BridgeObstacle & Double = js.native
    
    /* 7 */ val Bridging: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.Bridging & Double = js.native
    
    /* 13 */ val CrispEdges: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.CrispEdges & Double = js.native
    
    /* 20 */ val Default: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.Default & Double = js.native
    
    /* 2 */ val Delete: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.Delete & Double = js.native
    
    /* 3 */ val Drag: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.Drag & Double = js.native
    
    /* 8 */ val DragLabel: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.DragLabel & Double = js.native
    
    /* 15 */ val DragLimit: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.DragLimit & Double = js.native
    
    /* 6 */ val DragSegmentThumb: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.DragSegmentThumb & Double = js.native
    
    /* 4 */ val DragSourceEnd: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.DragSourceEnd & Double = js.native
    
    /* 5 */ val DragTargetEnd: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.DragTargetEnd & Double = js.native
    
    /* 9 */ val InheritBridging: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.InheritBridging & Double = js.native
    
    /* 14 */ val InheritCrispEdges: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.InheritCrispEdges & Double = js.native
    
    /* 19 */ val InheritRouting: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.InheritRouting & Double = js.native
    
    /* 11 */ val InheritTooltip: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.InheritTooltip & Double = js.native
    
    /* 17 */ val Interaction: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.Interaction & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.None & Double = js.native
    
    /* 12 */ val PointerEvents: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.PointerEvents & Double = js.native
    
    /* 18 */ val Routing: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.Routing & Double = js.native
    
    /* 1 */ val Select: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorConstraints.Select & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.ConnectorShapes")
  @js.native
  object ConnectorShapes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorShapes & Double] = js.native
    
    /* 0 */ val BPMN: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorShapes.BPMN & Double = js.native
    
    /* 2 */ val UMLActivity: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorShapes.UMLActivity & Double = js.native
    
    /* 1 */ val UMLClassifier: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorShapes.UMLClassifier & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.ContainerType")
  @js.native
  object ContainerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ContainerType & Double] = js.native
    
    /* 0 */ val Canvas: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ContainerType.Canvas & Double = js.native
    
    /* 1 */ val Stack: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ContainerType.Stack & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.DecoratorShapes")
  @js.native
  object DecoratorShapes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DecoratorShapes & Double] = js.native
    
    /* 1 */ val Arrow: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DecoratorShapes.Arrow & Double = js.native
    
    /* 3 */ val Circle: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DecoratorShapes.Circle & Double = js.native
    
    /* 4 */ val Diamond: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DecoratorShapes.Diamond & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DecoratorShapes.None & Double = js.native
    
    /* 2 */ val OpenArrow: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DecoratorShapes.OpenArrow & Double = js.native
    
    /* 5 */ val Path: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DecoratorShapes.Path & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.DiagramConstraints")
  @js.native
  object DiagramConstraints extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DiagramConstraints & Double
      ] = js.native
    
    /* 1 */ val APIUpdate: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DiagramConstraints.APIUpdate & Double = js.native
    
    /* 4 */ val Bridging: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DiagramConstraints.Bridging & Double = js.native
    
    /* 10 */ val CrispEdges: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DiagramConstraints.CrispEdges & Double = js.native
    
    /* 15 */ val Default: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DiagramConstraints.Default & Double = js.native
    
    /* 13 */ val FloatElements: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DiagramConstraints.FloatElements & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DiagramConstraints.None & Double = js.native
    
    /* 3 */ val PageEditable: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DiagramConstraints.PageEditable & Double = js.native
    
    /* 8 */ val Pannable: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DiagramConstraints.Pannable & Double = js.native
    
    /* 6 */ val PannableX: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DiagramConstraints.PannableX & Double = js.native
    
    /* 7 */ val PannableY: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DiagramConstraints.PannableY & Double = js.native
    
    /* 11 */ val Resizable: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DiagramConstraints.Resizable & Double = js.native
    
    /* 14 */ val Routing: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DiagramConstraints.Routing & Double = js.native
    
    /* 9 */ val Undoable: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DiagramConstraints.Undoable & Double = js.native
    
    /* 2 */ val UserInteraction: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DiagramConstraints.UserInteraction & Double = js.native
    
    /* 12 */ val ZoomTextEditor: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DiagramConstraints.ZoomTextEditor & Double = js.native
    
    /* 5 */ val Zoomable: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DiagramConstraints.Zoomable & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.ExportModes")
  @js.native
  object ExportModes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ExportModes & Double] = js.native
    
    /* 1 */ val Data: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ExportModes.Data & Double = js.native
    
    /* 0 */ val Download: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ExportModes.Download & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.FileFormats")
  @js.native
  object FileFormats extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FileFormats & Double] = js.native
    
    /* 2 */ val BMP: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FileFormats.BMP & Double = js.native
    
    /* 0 */ val JPG: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FileFormats.JPG & Double = js.native
    
    /* 1 */ val PNG: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FileFormats.PNG & Double = js.native
    
    /* 3 */ val SVG: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FileFormats.SVG & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.FitMode")
  @js.native
  object FitMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FitMode & Double] = js.native
    
    /* 2 */ val Height: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FitMode.Height & Double = js.native
    
    /* 0 */ val Page: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FitMode.Page & Double = js.native
    
    /* 1 */ val Width: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FitMode.Width & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.FlowShapes")
  @js.native
  object FlowShapes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes & Double] = js.native
    
    /* 19 */ val Annotation1: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.Annotation1 & Double = js.native
    
    /* 20 */ val Annotation2: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.Annotation2 & Double = js.native
    
    /* 22 */ val Card: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.Card & Double = js.native
    
    /* 10 */ val Collate: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.Collate & Double = js.native
    
    /* 21 */ val Data: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.Data & Double = js.native
    
    /* 1 */ val Decision: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.Decision & Double = js.native
    
    /* 6 */ val DirectData: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.DirectData & Double = js.native
    
    /* 2 */ val Document: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.Document & Double = js.native
    
    /* 14 */ val Extract: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.Extract & Double = js.native
    
    /* 13 */ val InternalStorage: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.InternalStorage & Double = js.native
    
    /* 15 */ val ManualOperation: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.ManualOperation & Double = js.native
    
    /* 16 */ val Merge: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.Merge & Double = js.native
    
    /* 9 */ val MultiDocument: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.MultiDocument & Double = js.native
    
    /* 17 */ val OffPageReference: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.OffPageReference & Double = js.native
    
    /* 12 */ val Or: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.Or & Double = js.native
    
    /* 5 */ val PaperTap: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.PaperTap & Double = js.native
    
    /* 3 */ val PreDefinedProcess: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.PreDefinedProcess & Double = js.native
    
    /* 0 */ val Process: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.Process & Double = js.native
    
    /* 18 */ val SequentialAccessStorage: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.SequentialAccessStorage & Double = js.native
    
    /* 7 */ val SequentialData: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.SequentialData & Double = js.native
    
    /* 8 */ val Sort: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.Sort & Double = js.native
    
    /* 11 */ val SummingJunction: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.SummingJunction & Double = js.native
    
    /* 4 */ val Terminator: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.FlowShapes.Terminator & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.HorizontalAlignment")
  @js.native
  object HorizontalAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.HorizontalAlignment & Double
      ] = js.native
    
    /* 1 */ val Center: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.HorizontalAlignment.Center & Double = js.native
    
    /* 0 */ val Left: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.HorizontalAlignment.Left & Double = js.native
    
    /* 2 */ val Right: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.HorizontalAlignment.Right & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.IconShapes")
  @js.native
  object IconShapes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.IconShapes & Double] = js.native
    
    /* 1 */ val Arrow: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.IconShapes.Arrow & Double = js.native
    
    /* 6 */ val Image: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.IconShapes.Image & Double = js.native
    
    /* 3 */ val Minus: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.IconShapes.Minus & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.IconShapes.None & Double = js.native
    
    /* 4 */ val Path: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.IconShapes.Path & Double = js.native
    
    /* 2 */ val Plus: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.IconShapes.Plus & Double = js.native
    
    /* 5 */ val Template: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.IconShapes.Template & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.ImageAlignment")
  @js.native
  object ImageAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ImageAlignment & Double] = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ImageAlignment.None & Double = js.native
    
    /* 9 */ val XMaxYMax: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ImageAlignment.XMaxYMax & Double = js.native
    
    /* 8 */ val XMaxYMid: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ImageAlignment.XMaxYMid & Double = js.native
    
    /* 7 */ val XMaxYMin: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ImageAlignment.XMaxYMin & Double = js.native
    
    /* 6 */ val XMidYMax: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ImageAlignment.XMidYMax & Double = js.native
    
    /* 5 */ val XMidYMid: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ImageAlignment.XMidYMid & Double = js.native
    
    /* 4 */ val XMidYMin: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ImageAlignment.XMidYMin & Double = js.native
    
    /* 3 */ val XMinYMax: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ImageAlignment.XMinYMax & Double = js.native
    
    /* 2 */ val XMinYMid: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ImageAlignment.XMinYMid & Double = js.native
    
    /* 1 */ val XMinYMin: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ImageAlignment.XMinYMin & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.KeyModifiers")
  @js.native
  object KeyModifiers extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.KeyModifiers & Double] = js.native
    
    /* 1 */ val Alt: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.KeyModifiers.Alt & Double = js.native
    
    /* 2 */ val Control: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.KeyModifiers.Control & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.KeyModifiers.None & Double = js.native
    
    /* 3 */ val Shift: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.KeyModifiers.Shift & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.Keys")
  @js.native
  object Keys extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys & Double] = js.native
    
    /* 1 */ val A: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.A & Double = js.native
    
    /* 2 */ val B: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.B & Double = js.native
    
    /* 3 */ val C: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.C & Double = js.native
    
    /* 4 */ val D: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.D & Double = js.native
    
    /* 42 */ val Delete: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Delete & Double = js.native
    
    /* 40 */ val Down: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Down & Double = js.native
    
    /* 5 */ val E: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.E & Double = js.native
    
    /* 44 */ val Enter: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Enter & Double = js.native
    
    /* 41 */ val Escape: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Escape & Double = js.native
    
    /* 6 */ val F: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.F & Double = js.native
    
    /* 7 */ val G: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.G & Double = js.native
    
    /* 8 */ val H: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.H & Double = js.native
    
    /* 9 */ val I: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.I & Double = js.native
    
    /* 10 */ val J: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.J & Double = js.native
    
    /* 11 */ val K: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.K & Double = js.native
    
    /* 12 */ val L: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.L & Double = js.native
    
    /* 37 */ val Left: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Left & Double = js.native
    
    /* 13 */ val M: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.M & Double = js.native
    
    /* 14 */ val N: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.N & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.None & Double = js.native
    
    /* 27 */ val Number0: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Number0 & Double = js.native
    
    /* 28 */ val Number1: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Number1 & Double = js.native
    
    /* 29 */ val Number2: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Number2 & Double = js.native
    
    /* 30 */ val Number3: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Number3 & Double = js.native
    
    /* 31 */ val Number4: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Number4 & Double = js.native
    
    /* 32 */ val Number5: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Number5 & Double = js.native
    
    /* 33 */ val Number6: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Number6 & Double = js.native
    
    /* 34 */ val Number7: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Number7 & Double = js.native
    
    /* 35 */ val Number8: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Number8 & Double = js.native
    
    /* 36 */ val Number9: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Number9 & Double = js.native
    
    /* 15 */ val O: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.O & Double = js.native
    
    /* 16 */ val P: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.P & Double = js.native
    
    /* 17 */ val Q: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Q & Double = js.native
    
    /* 18 */ val R: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.R & Double = js.native
    
    /* 39 */ val Right: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Right & Double = js.native
    
    /* 19 */ val S: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.S & Double = js.native
    
    /* 20 */ val T: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.T & Double = js.native
    
    /* 43 */ val Tab: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Tab & Double = js.native
    
    /* 21 */ val U: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.U & Double = js.native
    
    /* 38 */ val Up: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Up & Double = js.native
    
    /* 22 */ val V: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.V & Double = js.native
    
    /* 23 */ val W: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.W & Double = js.native
    
    /* 24 */ val X: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.X & Double = js.native
    
    /* 25 */ val Y: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Y & Double = js.native
    
    /* 26 */ val Z: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Keys.Z & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.LabelConstraints")
  @js.native
  object LabelConstraints extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LabelConstraints & Double] = js.native
    
    /* 5 */ val All: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LabelConstraints.All & Double = js.native
    
    /* 2 */ val Draggable: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LabelConstraints.Draggable & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LabelConstraints.None & Double = js.native
    
    /* 3 */ val Resizable: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LabelConstraints.Resizable & Double = js.native
    
    /* 4 */ val Rotatable: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LabelConstraints.Rotatable & Double = js.native
    
    /* 1 */ val Selectable: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LabelConstraints.Selectable & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.LabelEditMode")
  @js.native
  object LabelEditMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LabelEditMode & Double] = js.native
    
    /* 0 */ val Edit: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LabelEditMode.Edit & Double = js.native
    
    /* 1 */ val View: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LabelEditMode.View & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.LabelRelativeMode")
  @js.native
  object LabelRelativeMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LabelRelativeMode & Double] = js.native
    
    /* 1 */ val SegmentBounds: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LabelRelativeMode.SegmentBounds & Double = js.native
    
    /* 0 */ val SegmentPath: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LabelRelativeMode.SegmentPath & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.LabelRenderingMode")
  @js.native
  object LabelRenderingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LabelRenderingMode & Double
      ] = js.native
    
    /* 0 */ val HTML: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LabelRenderingMode.HTML & Double = js.native
    
    /* 1 */ val SVG: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LabelRenderingMode.SVG & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.LayoutOrientations")
  @js.native
  object LayoutOrientations extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LayoutOrientations & Double
      ] = js.native
    
    /* 1 */ val BottomToTop: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LayoutOrientations.BottomToTop & Double = js.native
    
    /* 2 */ val LeftToRight: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LayoutOrientations.LeftToRight & Double = js.native
    
    /* 3 */ val RightToLeft: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LayoutOrientations.RightToLeft & Double = js.native
    
    /* 0 */ val TopToBottom: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LayoutOrientations.TopToBottom & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.LayoutTypes")
  @js.native
  object LayoutTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LayoutTypes & Double] = js.native
    
    /* 1 */ val HierarchicalTree: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LayoutTypes.HierarchicalTree & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LayoutTypes.None & Double = js.native
    
    /* 2 */ val OrganizationalChart: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LayoutTypes.OrganizationalChart & Double = js.native
    
    /* 3 */ val RadialTree: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LayoutTypes.RadialTree & Double = js.native
    
    /* 4 */ val SymmetricLayout: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.LayoutTypes.SymmetricLayout & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.Diagram.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.datavisualization.Diagram.Multiplicity")
  @js.native
  object Multiplicity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Multiplicity & Double] = js.native
    
    /* 3 */ val ManyToMany: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Multiplicity.ManyToMany & Double = js.native
    
    /* 2 */ val ManyToOne: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Multiplicity.ManyToOne & Double = js.native
    
    /* 1 */ val OneToMany: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Multiplicity.OneToMany & Double = js.native
    
    /* 0 */ val OneToOne: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Multiplicity.OneToOne & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.NodeConstraints")
  @js.native
  object NodeConstraints extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints & Double] = js.native
    
    /* 17 */ val AllowPan: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.AllowPan & Double = js.native
    
    /* 18 */ val AspectRatio: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.AspectRatio & Double = js.native
    
    /* 5 */ val Connect: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.Connect & Double = js.native
    
    /* 20 */ val CrispEdges: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.CrispEdges & Double = js.native
    
    /* 21 */ val Default: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.Default & Double = js.native
    
    /* 2 */ val Delete: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.Delete & Double = js.native
    
    /* 3 */ val Drag: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.Drag & Double = js.native
    
    /* 16 */ val DragLabel: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.DragLabel & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.None & Double = js.native
    
    /* 19 */ val PointerEvents: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.PointerEvents & Double = js.native
    
    /* 14 */ val Resize: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.Resize & Double = js.native
    
    /* 7 */ val ResizeEast: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.ResizeEast & Double = js.native
    
    /* 13 */ val ResizeNorth: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.ResizeNorth & Double = js.native
    
    /* 6 */ val ResizeNorthEast: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.ResizeNorthEast & Double = js.native
    
    /* 12 */ val ResizeNorthWest: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.ResizeNorthWest & Double = js.native
    
    /* 9 */ val ResizeSouth: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.ResizeSouth & Double = js.native
    
    /* 8 */ val ResizeSouthEast: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.ResizeSouthEast & Double = js.native
    
    /* 10 */ val ResizeSouthWest: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.ResizeSouthWest & Double = js.native
    
    /* 11 */ val ResizeWest: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.ResizeWest & Double = js.native
    
    /* 4 */ val Rotate: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.Rotate & Double = js.native
    
    /* 1 */ val Select: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.Select & Double = js.native
    
    /* 15 */ val Shadow: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeConstraints.Shadow & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.OverflowType")
  @js.native
  object OverflowType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.OverflowType & Double] = js.native
    
    /* 1 */ val Clip: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.OverflowType.Clip & Double = js.native
    
    /* 0 */ val Ellipsis: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.OverflowType.Ellipsis & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.PageOrientations")
  @js.native
  object PageOrientations extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PageOrientations & Double] = js.native
    
    /* 0 */ val Landscape: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PageOrientations.Landscape & Double = js.native
    
    /* 1 */ val Portrait: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PageOrientations.Portrait & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.PortConstraints")
  @js.native
  object PortConstraints extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PortConstraints & Double] = js.native
    
    /* 1 */ val Connect: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PortConstraints.Connect & Double = js.native
    
    /* 2 */ val ConnectOnDrag: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PortConstraints.ConnectOnDrag & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PortConstraints.None & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.PortShapes")
  @js.native
  object PortShapes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PortShapes & Double] = js.native
    
    /* 1 */ val Circle: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PortShapes.Circle & Double = js.native
    
    /* 3 */ val Path: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PortShapes.Path & Double = js.native
    
    /* 2 */ val Square: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PortShapes.Square & Double = js.native
    
    /* 0 */ val X: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PortShapes.X & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.PortVisibility")
  @js.native
  object PortVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PortVisibility & Double] = js.native
    
    /* 3 */ val Connect: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PortVisibility.Connect & Double = js.native
    
    /* 4 */ val Default: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PortVisibility.Default & Double = js.native
    
    /* 1 */ val Hidden: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PortVisibility.Hidden & Double = js.native
    
    /* 2 */ val Hover: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PortVisibility.Hover & Double = js.native
    
    /* 0 */ val Visible: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PortVisibility.Visible & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.Region")
  @js.native
  object Region extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Region & Double] = js.native
    
    /* 0 */ val Content: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Region.Content & Double = js.native
    
    /* 1 */ val PageSettings: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Region.PageSettings & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.RelativeMode")
  @js.native
  object RelativeMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.RelativeMode & Double] = js.native
    
    /* 1 */ val Mouse: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.RelativeMode.Mouse & Double = js.native
    
    /* 0 */ val Object: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.RelativeMode.Object & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.ScrollLimit")
  @js.native
  object ScrollLimit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ScrollLimit & Double] = js.native
    
    /* 1 */ val Diagram: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ScrollLimit.Diagram & Double = js.native
    
    /* 0 */ val Infinite: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ScrollLimit.Infinite & Double = js.native
    
    /* 2 */ val Limited: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ScrollLimit.Limited & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.Segments")
  @js.native
  object Segments extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Segments & Double] = js.native
    
    /* 2 */ val Bezier: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Segments.Bezier & Double = js.native
    
    /* 1 */ val Orthogonal: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Segments.Orthogonal & Double = js.native
    
    /* 0 */ val Straight: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Segments.Straight & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.SelectorConstraints")
  @js.native
  object SelectorConstraints extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SelectorConstraints & Double
      ] = js.native
    
    /* 7 */ val All: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SelectorConstraints.All & Double = js.native
    
    /* 6 */ val AutoHideThumbs: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SelectorConstraints.AutoHideThumbs & Double = js.native
    
    /* 5 */ val DragOnEmptySpace: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SelectorConstraints.DragOnEmptySpace & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SelectorConstraints.None & Double = js.native
    
    /* 2 */ val Resizer: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SelectorConstraints.Resizer & Double = js.native
    
    /* 1 */ val Rotator: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SelectorConstraints.Rotator & Double = js.native
    
    /* 4 */ val Tooltip: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SelectorConstraints.Tooltip & Double = js.native
    
    /* 3 */ val UserHandles: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SelectorConstraints.UserHandles & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.Shapes")
  @js.native
  object Shapes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Shapes & Double] = js.native
    
    /* 6 */ val BPMN: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Shapes.BPMN & Double = js.native
    
    /* 4 */ val Basic: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Shapes.Basic & Double = js.native
    
    /* 5 */ val Flow: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Shapes.Flow & Double = js.native
    
    /* 2 */ val Html: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Shapes.Html & Double = js.native
    
    /* 1 */ val Image: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Shapes.Image & Double = js.native
    
    /* 3 */ val Native: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Shapes.Native & Double = js.native
    
    /* 0 */ val Text: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Shapes.Text & Double = js.native
    
    /* 8 */ val UMLActivity: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Shapes.UMLActivity & Double = js.native
    
    /* 7 */ val UMLClassifier: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Shapes.UMLClassifier & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.SnapConstraints")
  @js.native
  object SnapConstraints extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SnapConstraints & Double] = js.native
    
    /* 7 */ val All: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SnapConstraints.All & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SnapConstraints.None & Double = js.native
    
    /* 4 */ val ShowHorizontalLines: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SnapConstraints.ShowHorizontalLines & Double = js.native
    
    /* 6 */ val ShowLines: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SnapConstraints.ShowLines & Double = js.native
    
    /* 5 */ val ShowVerticalLines: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SnapConstraints.ShowVerticalLines & Double = js.native
    
    /* 1 */ val SnapToHorizontalLines: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SnapConstraints.SnapToHorizontalLines & Double = js.native
    
    /* 3 */ val SnapToLines: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SnapConstraints.SnapToLines & Double = js.native
    
    /* 2 */ val SnapToVerticalLines: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SnapConstraints.SnapToVerticalLines & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.Stretch")
  @js.native
  object Stretch extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Stretch & Double] = js.native
    
    /* 1 */ val Fill: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Stretch.Fill & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Stretch.None & Double = js.native
    
    /* 2 */ val Uniform: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Stretch.Uniform & Double = js.native
    
    /* 3 */ val UniformToFill: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Stretch.UniformToFill & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.TextAlign")
  @js.native
  object TextAlign extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.TextAlign & Double] = js.native
    
    /* 1 */ val Center: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.TextAlign.Center & Double = js.native
    
    /* 0 */ val Left: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.TextAlign.Left & Double = js.native
    
    /* 2 */ val Right: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.TextAlign.Right & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.TextDecorations")
  @js.native
  object TextDecorations extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.TextDecorations & Double] = js.native
    
    /* 2 */ val LineThrough: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.TextDecorations.LineThrough & Double = js.native
    
    /* 3 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.TextDecorations.None & Double = js.native
    
    /* 1 */ val Overline: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.TextDecorations.Overline & Double = js.native
    
    /* 0 */ val Underline: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.TextDecorations.Underline & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.TextWrapping")
  @js.native
  object TextWrapping extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.TextWrapping & Double] = js.native
    
    /* 0 */ val NoWrap: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.TextWrapping.NoWrap & Double = js.native
    
    /* 1 */ val Wrap: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.TextWrapping.Wrap & Double = js.native
    
    /* 2 */ val WrapWithOverflow: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.TextWrapping.WrapWithOverflow & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.TickAlignment")
  @js.native
  object TickAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.TickAlignment & Double] = js.native
    
    /* 0 */ val LeftOrTop: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.TickAlignment.LeftOrTop & Double = js.native
    
    /* 1 */ val RightOrBottom: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.TickAlignment.RightOrBottom & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.Tool")
  @js.native
  object Tool extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Tool & Double] = js.native
    
    /* 5 */ val ContinuesDraw: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Tool.ContinuesDraw & Double = js.native
    
    /* 4 */ val DrawOnce: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Tool.DrawOnce & Double = js.native
    
    /* 2 */ val MultipleSelect: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Tool.MultipleSelect & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Tool.None & Double = js.native
    
    /* 1 */ val SingleSelect: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Tool.SingleSelect & Double = js.native
    
    /* 3 */ val ZoomPan: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.Tool.ZoomPan & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.UMLActivityFlow")
  @js.native
  object UMLActivityFlow extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UMLActivityFlow & Double] = js.native
    
    /* 1 */ val Control: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UMLActivityFlow.Control & Double = js.native
    
    /* 2 */ val Exception: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UMLActivityFlow.Exception & Double = js.native
    
    /* 0 */ val Object: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UMLActivityFlow.Object & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.UMLActivityShapes")
  @js.native
  object UMLActivityShapes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UMLActivityShapes & Double] = js.native
    
    /* 8 */ val AcceptingEvent: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UMLActivityShapes.AcceptingEvent & Double = js.native
    
    /* 0 */ val Action: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UMLActivityShapes.Action & Double = js.native
    
    /* 1 */ val Decision: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UMLActivityShapes.Decision & Double = js.native
    
    /* 4 */ val FinalNode: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UMLActivityShapes.FinalNode & Double = js.native
    
    /* 5 */ val ForkNode: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UMLActivityShapes.ForkNode & Double = js.native
    
    /* 3 */ val InitialNode: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UMLActivityShapes.InitialNode & Double = js.native
    
    /* 6 */ val JoinNode: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UMLActivityShapes.JoinNode & Double = js.native
    
    /* 2 */ val MergeNode: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UMLActivityShapes.MergeNode & Double = js.native
    
    /* 12 */ val Note: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UMLActivityShapes.Note & Double = js.native
    
    /* 10 */ val ReceiveSignal: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UMLActivityShapes.ReceiveSignal & Double = js.native
    
    /* 9 */ val SendSignal: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UMLActivityShapes.SendSignal & Double = js.native
    
    /* 11 */ val StructuredNode: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UMLActivityShapes.StructuredNode & Double = js.native
    
    /* 7 */ val TimeEvent: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UMLActivityShapes.TimeEvent & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.UserHandlePositions")
  @js.native
  object UserHandlePositions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UserHandlePositions & Double
      ] = js.native
    
    /* 6 */ val BottomCenter: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UserHandlePositions.BottomCenter & Double = js.native
    
    /* 5 */ val BottomLeft: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UserHandlePositions.BottomLeft & Double = js.native
    
    /* 7 */ val BottomRight: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UserHandlePositions.BottomRight & Double = js.native
    
    /* 3 */ val MiddleLeft: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UserHandlePositions.MiddleLeft & Double = js.native
    
    /* 4 */ val MiddleRight: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UserHandlePositions.MiddleRight & Double = js.native
    
    /* 1 */ val TopCenter: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UserHandlePositions.TopCenter & Double = js.native
    
    /* 0 */ val TopLeft: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UserHandlePositions.TopLeft & Double = js.native
    
    /* 2 */ val TopRight: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.UserHandlePositions.TopRight & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.VerticalAlignment")
  @js.native
  object VerticalAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.VerticalAlignment & Double] = js.native
    
    /* 2 */ val Bottom: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.VerticalAlignment.Bottom & Double = js.native
    
    /* 1 */ val Center: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.VerticalAlignment.Center & Double = js.native
    
    /* 0 */ val Top: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.VerticalAlignment.Top & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Diagram.ZoomCommand")
  @js.native
  object ZoomCommand extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ZoomCommand & Double] = js.native
    
    /* 0 */ val ZoomIn: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ZoomCommand.ZoomIn & Double = js.native
    
    /* 1 */ val ZoomOut: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ZoomCommand.ZoomOut & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.Diagram.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.datavisualization.Diagram): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
