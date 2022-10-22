package typingsJapgolly.angularCompilerCli

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalState
import typingsJapgolly.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscIncrementalSrcStrategyMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental/src/strategy", "NoopIncrementalBuildStrategy")
  @js.native
  open class NoopIncrementalBuildStrategy ()
    extends StObject
       with IncrementalBuildStrategy {
    
    def getIncrementalState(): Null = js.native
    /**
      * Determine the Angular `IncrementalDriver` for the given `ts.Program`, if one is available.
      */
    /* CompleteClass */
    override def getIncrementalState(program: Program): IncrementalState | Null = js.native
    
    def setIncrementalState(): Unit = js.native
    /**
      * Associate the given `IncrementalDriver` with the given `ts.Program` and make it available to
      * future compilations.
      */
    /* CompleteClass */
    override def setIncrementalState(driver: IncrementalState, program: Program): Unit = js.native
    
    /**
      * Convert this `IncrementalBuildStrategy` into a possibly new instance to be used in the next
      * incremental compilation (may be a no-op if the strategy is not stateful).
      */
    /* CompleteClass */
    override def toNextBuildStrategy(): IncrementalBuildStrategy = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental/src/strategy", "PatchedProgramIncrementalBuildStrategy")
  @js.native
  open class PatchedProgramIncrementalBuildStrategy ()
    extends StObject
       with IncrementalBuildStrategy {
    
    /**
      * Determine the Angular `IncrementalDriver` for the given `ts.Program`, if one is available.
      */
    /* CompleteClass */
    override def getIncrementalState(program: Program): IncrementalState | Null = js.native
    
    /**
      * Associate the given `IncrementalDriver` with the given `ts.Program` and make it available to
      * future compilations.
      */
    /* CompleteClass */
    override def setIncrementalState(driver: IncrementalState, program: Program): Unit = js.native
    
    /**
      * Convert this `IncrementalBuildStrategy` into a possibly new instance to be used in the next
      * incremental compilation (may be a no-op if the strategy is not stateful).
      */
    /* CompleteClass */
    override def toNextBuildStrategy(): IncrementalBuildStrategy = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental/src/strategy", "TrackedIncrementalBuildStrategy")
  @js.native
  open class TrackedIncrementalBuildStrategy ()
    extends StObject
       with IncrementalBuildStrategy {
    
    def getIncrementalState(): IncrementalState | Null = js.native
    /**
      * Determine the Angular `IncrementalDriver` for the given `ts.Program`, if one is available.
      */
    /* CompleteClass */
    override def getIncrementalState(program: Program): IncrementalState | Null = js.native
    
    /* private */ var isSet: Any = js.native
    
    /**
      * Associate the given `IncrementalDriver` with the given `ts.Program` and make it available to
      * future compilations.
      */
    /* CompleteClass */
    override def setIncrementalState(driver: IncrementalState, program: Program): Unit = js.native
    def setIncrementalState(state: IncrementalState): Unit = js.native
    
    /* private */ var state: Any = js.native
    
    /**
      * Convert this `IncrementalBuildStrategy` into a possibly new instance to be used in the next
      * incremental compilation (may be a no-op if the strategy is not stateful).
      */
    /* CompleteClass */
    override def toNextBuildStrategy(): IncrementalBuildStrategy = js.native
  }
  
  trait IncrementalBuildStrategy extends StObject {
    
    /**
      * Determine the Angular `IncrementalDriver` for the given `ts.Program`, if one is available.
      */
    def getIncrementalState(program: Program): IncrementalState | Null
    
    /**
      * Associate the given `IncrementalDriver` with the given `ts.Program` and make it available to
      * future compilations.
      */
    def setIncrementalState(driver: IncrementalState, program: Program): Unit
    
    /**
      * Convert this `IncrementalBuildStrategy` into a possibly new instance to be used in the next
      * incremental compilation (may be a no-op if the strategy is not stateful).
      */
    def toNextBuildStrategy(): IncrementalBuildStrategy
  }
  object IncrementalBuildStrategy {
    
    inline def apply(
      getIncrementalState: Program => IncrementalState | Null,
      setIncrementalState: (IncrementalState, Program) => Callback,
      toNextBuildStrategy: CallbackTo[IncrementalBuildStrategy]
    ): IncrementalBuildStrategy = {
      val __obj = js.Dynamic.literal(getIncrementalState = js.Any.fromFunction1(getIncrementalState), setIncrementalState = js.Any.fromFunction2((t0: IncrementalState, t1: Program) => (setIncrementalState(t0, t1)).runNow()), toNextBuildStrategy = toNextBuildStrategy.toJsFn)
      __obj.asInstanceOf[IncrementalBuildStrategy]
    }
    
    extension [Self <: IncrementalBuildStrategy](x: Self) {
      
      inline def setGetIncrementalState(value: Program => IncrementalState | Null): Self = StObject.set(x, "getIncrementalState", js.Any.fromFunction1(value))
      
      inline def setSetIncrementalState(value: (IncrementalState, Program) => Callback): Self = StObject.set(x, "setIncrementalState", js.Any.fromFunction2((t0: IncrementalState, t1: Program) => (value(t0, t1)).runNow()))
      
      inline def setToNextBuildStrategy(value: CallbackTo[IncrementalBuildStrategy]): Self = StObject.set(x, "toNextBuildStrategy", value.toJsFn)
    }
  }
}
