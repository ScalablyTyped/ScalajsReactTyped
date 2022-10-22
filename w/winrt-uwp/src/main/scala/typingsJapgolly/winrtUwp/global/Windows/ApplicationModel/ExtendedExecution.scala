package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedReason
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a mechanism for applications to execute when they are not in the foreground. */
object ExtendedExecution {
  
  /** Describes the reason for the background execution request. */
  @JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason")
  @js.native
  object ExtendedExecutionReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason & Double
      ] = js.native
    
    /* 1 */ val locationTracking: typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason.locationTracking & Double = js.native
    
    /* 2 */ val savingData: typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason.savingData & Double = js.native
    
    /* 0 */ val unspecified: typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason.unspecified & Double = js.native
  }
  
  /** Specifies the possible background execution request result values. */
  @JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionResult")
  @js.native
  object ExtendedExecutionResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionResult & Double
      ] = js.native
    
    /* 0 */ val allowed: typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionResult.allowed & Double = js.native
    
    /* 1 */ val denied: typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionResult.denied & Double = js.native
  }
  
  /** Represents the object that is passed as a parameter to the event handler that is invoked when the system revokes background execution. */
  /* note: abstract class */ @JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedEventArgs")
  @js.native
  open class ExtendedExecutionRevokedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedEventArgs {
    
    /** Gets the reason background execution was revoked. */
    /* CompleteClass */
    var reason: ExtendedExecutionRevokedReason = js.native
  }
  
  /** Describes the reason background execution was revoked. */
  @JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedReason")
  @js.native
  object ExtendedExecutionRevokedReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedReason & Double
      ] = js.native
    
    /* 0 */ val resumed: typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedReason.resumed & Double = js.native
    
    /* 1 */ val systemPolicy: typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedReason.systemPolicy & Double = js.native
  }
  
  /** Supports managing a request for background execution. */
  @JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionSession")
  @js.native
  /** Creates an ExtendedExecutionSession object. */
  open class ExtendedExecutionSession ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionSession
  
  /** Provides a mechanism for applications to perform extended execution while they are in the foreground. */
  object Foreground {
    
    /** Describes the reason for the extended execution request. */
    @JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason")
    @js.native
    object ExtendedExecutionForegroundReason extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason & Double
          ] = js.native
      
      /* 2 */ val backgroundAudio: typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason.backgroundAudio & Double = js.native
      
      /* 1 */ val savingData: typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason.savingData & Double = js.native
      
      /* 3 */ val unconstrained: typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason.unconstrained & Double = js.native
      
      /* 0 */ val unspecified: typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason.unspecified & Double = js.native
    }
    
    /** Specifies the possible extended execution request result values. */
    @JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundResult")
    @js.native
    object ExtendedExecutionForegroundResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundResult & Double
          ] = js.native
      
      /* 0 */ val allowed: typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundResult.allowed & Double = js.native
      
      /* 1 */ val denied: typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundResult.denied & Double = js.native
    }
    
    /** Passed to the event handler that is invoked when the system revokes extended execution. */
    /* note: abstract class */ @JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedEventArgs")
    @js.native
    open class ExtendedExecutionForegroundRevokedEventArgs ()
      extends StObject
         with typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedEventArgs {
      
      /** Gets the reason extended execution was revoked. */
      /* CompleteClass */
      var reason: ExtendedExecutionForegroundRevokedReason = js.native
    }
    
    /** Describes the reason extended execution was revoked. */
    @JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedReason")
    @js.native
    object ExtendedExecutionForegroundRevokedReason extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedReason & Double
          ] = js.native
      
      /* 0 */ val resumed: typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedReason.resumed & Double = js.native
      
      /* 1 */ val systemPolicy: typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedReason.systemPolicy & Double = js.native
    }
    
    /** Supports managing a request for extended foreground execution. */
    @JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundSession")
    @js.native
    /** Creates an ExtendedExecutionForegroundSession object */
    open class ExtendedExecutionForegroundSession ()
      extends StObject
         with typingsJapgolly.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundSession
  }
}
