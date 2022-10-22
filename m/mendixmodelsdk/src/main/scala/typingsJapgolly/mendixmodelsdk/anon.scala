package typingsJapgolly.mendixmodelsdk

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.mendixmodelsdk.srcCommonMod.common.IErrorCallback
import typingsJapgolly.mendixmodelsdk.srcSdkConfigurationMod.configuration.ISdkConfig
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalImodelserverclientMod.IModelServerClient
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import typingsJapgolly.mendixmodelsdk.srcSdkInternalWorkingCopyEventsIworkingcopyeventMod.BuildResultStatus
import typingsJapgolly.mendixmodelsdk.srcSdkUtilsMod.utils.IMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Action[T] extends StObject {
    
    def action(): T
    
    def undoAction(): Unit
  }
  object Action {
    
    inline def apply[T](action: CallbackTo[T], undoAction: Callback): Action[T] = {
      val __obj = js.Dynamic.literal(action = action.toJsFn, undoAction = undoAction.toJsFn)
      __obj.asInstanceOf[Action[T]]
    }
    
    extension [Self <: Action[?], T](x: Self & Action[T]) {
      
      inline def setAction(value: CallbackTo[T]): Self = StObject.set(x, "action", value.toJsFn)
      
      inline def setUndoAction(value: Callback): Self = StObject.set(x, "undoAction", value.toJsFn)
    }
  }
  
  trait Copy extends StObject {
    
    var copy: Element[IAbstractModel]
    
    var idMap: IMap[Structure[IAbstractModel, IContainer | Null]]
  }
  object Copy {
    
    inline def apply(copy: Element[IAbstractModel], idMap: IMap[Structure[IAbstractModel, IContainer | Null]]): Copy = {
      val __obj = js.Dynamic.literal(copy = copy.asInstanceOf[js.Any], idMap = idMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Copy]
    }
    
    extension [Self <: Copy](x: Self) {
      
      inline def setCopy(value: Element[IAbstractModel]): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      inline def setIdMap(value: IMap[Structure[IAbstractModel, IContainer | Null]]): Self = StObject.set(x, "idMap", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventId extends StObject {
    
    var eventId: Double
    
    var message: String
    
    var problems: js.Array[Any]
    
    var status: BuildResultStatus
  }
  object EventId {
    
    inline def apply(eventId: Double, message: String, problems: js.Array[Any], status: BuildResultStatus): EventId = {
      val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], problems = problems.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventId]
    }
    
    extension [Self <: EventId](x: Self) {
      
      inline def setEventId(value: Double): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setProblems(value: js.Array[Any]): Self = StObject.set(x, "problems", value.asInstanceOf[js.Any])
      
      inline def setProblemsVarargs(value: Any*): Self = StObject.set(x, "problems", js.Array(value*))
      
      inline def setStatus(value: BuildResultStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HandleError extends StObject {
    
    def handleError(message: String): Unit = js.native
    def handleError(message: String, errorCallback: IErrorCallback): Unit = js.native
  }
  
  @js.native
  trait Instantiable[CT /* <: AbstractModel & IT */, IT /* <: IAbstractModel */]
    extends StObject
       with Instantiable3[
          /* _client */ IModelServerClient, 
          /* _errorHandler */ IErrorCallback, 
          /* _connectionConfig */ ISdkConfig, 
          CT
        ]
  
  trait ToRawChangeValue[P] extends StObject {
    
    def toRawChangeValue(value: P): Any
  }
  object ToRawChangeValue {
    
    inline def apply[P](toRawChangeValue: P => Any): ToRawChangeValue[P] = {
      val __obj = js.Dynamic.literal(toRawChangeValue = js.Any.fromFunction1(toRawChangeValue))
      __obj.asInstanceOf[ToRawChangeValue[P]]
    }
    
    extension [Self <: ToRawChangeValue[?], P](x: Self & ToRawChangeValue[P]) {
      
      inline def setToRawChangeValue(value: P => Any): Self = StObject.set(x, "toRawChangeValue", js.Any.fromFunction1(value))
    }
  }
}
