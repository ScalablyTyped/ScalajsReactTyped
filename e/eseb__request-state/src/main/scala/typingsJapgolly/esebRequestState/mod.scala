package typingsJapgolly.esebRequestState

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@eseb/request-state", JSImport.Default)
  @js.native
  open class default[T] ()
    extends StObject
       with RequestState[T] {
    def this(state: State) = this()
    def this(state: Unit, attachment: T) = this()
    def this(state: State, attachment: T) = this()
    
    /** Does request have "FAILED" state? */
    /* CompleteClass */
    override def isFailed(): Boolean = js.native
    
    /** Does request have "IN_PROGESS" state? */
    /* CompleteClass */
    override def isInProgress(): Boolean = js.native
    
    /** Does request have "NOT_REQUESTED" state? */
    /* CompleteClass */
    override def isNotRequested(): Boolean = js.native
    
    /** Does request have "SUCCEEDED" state? */
    /* CompleteClass */
    override def isSucceeded(): Boolean = js.native
    
    /** Does the request have "NOT_REQUESTED" or "FAILED" state? */
    /* CompleteClass */
    override def shouldBeRequested(): Boolean = js.native
    
    /** Does the request have "NOT_REQUESTED" or "IN_PROGESS" state? */
    /* CompleteClass */
    override def shouldShowAsLoading(): Boolean = js.native
    
    /* CompleteClass */
    override val state: State = js.native
    
    /** Create a new `RequestState` instance with the same state and the passed attachment. */
    /* CompleteClass */
    override def withAttachment[A](attachment: A): RequestState[A] = js.native
  }
  
  @JSImport("@eseb/request-state", "FAILED")
  @js.native
  val FAILED: RequestState[scala.Nothing] = js.native
  
  @JSImport("@eseb/request-state", "IN_PROGRESS")
  @js.native
  val IN_PROGRESS: RequestState[scala.Nothing] = js.native
  
  @JSImport("@eseb/request-state", "NOT_REQUESTED")
  @js.native
  val NOT_REQUESTED: RequestState[scala.Nothing] = js.native
  
  @JSImport("@eseb/request-state", "SUCCEEDED")
  @js.native
  val SUCCEEDED: RequestState[scala.Nothing] = js.native
  
  trait RequestState[T] extends StObject {
    
    val attachment: js.UndefOr[T] = js.undefined
    
    /** Does request have "FAILED" state? */
    def isFailed(): Boolean
    
    /** Does request have "IN_PROGESS" state? */
    def isInProgress(): Boolean
    
    /** Does request have "NOT_REQUESTED" state? */
    def isNotRequested(): Boolean
    
    /** Does request have "SUCCEEDED" state? */
    def isSucceeded(): Boolean
    
    /** Does the request have "NOT_REQUESTED" or "FAILED" state? */
    def shouldBeRequested(): Boolean
    
    /** Does the request have "NOT_REQUESTED" or "IN_PROGESS" state? */
    def shouldShowAsLoading(): Boolean
    
    val state: State
    
    /** Create a new `RequestState` instance with the same state and the passed attachment. */
    def withAttachment[A](attachment: A): RequestState[A]
  }
  object RequestState {
    
    inline def apply[T](
      isFailed: CallbackTo[Boolean],
      isInProgress: CallbackTo[Boolean],
      isNotRequested: CallbackTo[Boolean],
      isSucceeded: CallbackTo[Boolean],
      shouldBeRequested: CallbackTo[Boolean],
      shouldShowAsLoading: CallbackTo[Boolean],
      state: State,
      withAttachment: Any => RequestState[Any]
    ): RequestState[T] = {
      val __obj = js.Dynamic.literal(isFailed = isFailed.toJsFn, isInProgress = isInProgress.toJsFn, isNotRequested = isNotRequested.toJsFn, isSucceeded = isSucceeded.toJsFn, shouldBeRequested = shouldBeRequested.toJsFn, shouldShowAsLoading = shouldShowAsLoading.toJsFn, state = state.asInstanceOf[js.Any], withAttachment = js.Any.fromFunction1(withAttachment))
      __obj.asInstanceOf[RequestState[T]]
    }
    
    extension [Self <: RequestState[?], T](x: Self & RequestState[T]) {
      
      inline def setAttachment(value: T): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
      
      inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
      
      inline def setIsFailed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFailed", value.toJsFn)
      
      inline def setIsInProgress(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInProgress", value.toJsFn)
      
      inline def setIsNotRequested(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNotRequested", value.toJsFn)
      
      inline def setIsSucceeded(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSucceeded", value.toJsFn)
      
      inline def setShouldBeRequested(value: CallbackTo[Boolean]): Self = StObject.set(x, "shouldBeRequested", value.toJsFn)
      
      inline def setShouldShowAsLoading(value: CallbackTo[Boolean]): Self = StObject.set(x, "shouldShowAsLoading", value.toJsFn)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setWithAttachment(value: Any => RequestState[Any]): Self = StObject.set(x, "withAttachment", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.esebRequestState.esebRequestStateStrings.FAILED
    - typingsJapgolly.esebRequestState.esebRequestStateStrings.IN_PROGRESS
    - typingsJapgolly.esebRequestState.esebRequestStateStrings.NOT_REQUESTED
    - typingsJapgolly.esebRequestState.esebRequestStateStrings.SUCCEEDED
  */
  trait State extends StObject
  object State {
    
    inline def FAILED: typingsJapgolly.esebRequestState.esebRequestStateStrings.FAILED = "FAILED".asInstanceOf[typingsJapgolly.esebRequestState.esebRequestStateStrings.FAILED]
    
    inline def IN_PROGRESS: typingsJapgolly.esebRequestState.esebRequestStateStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsJapgolly.esebRequestState.esebRequestStateStrings.IN_PROGRESS]
    
    inline def NOT_REQUESTED: typingsJapgolly.esebRequestState.esebRequestStateStrings.NOT_REQUESTED = "NOT_REQUESTED".asInstanceOf[typingsJapgolly.esebRequestState.esebRequestStateStrings.NOT_REQUESTED]
    
    inline def SUCCEEDED: typingsJapgolly.esebRequestState.esebRequestStateStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsJapgolly.esebRequestState.esebRequestStateStrings.SUCCEEDED]
  }
}
