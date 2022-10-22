package typingsJapgolly.jestAxe

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import typingsJapgolly.axeCore.mod.AxeResults
import typingsJapgolly.axeCore.mod.ImpactValue
import typingsJapgolly.axeCore.mod.Result
import typingsJapgolly.axeCore.mod.RunOptions
import typingsJapgolly.axeCore.mod.Spec
import typingsJapgolly.jestAxe.anon.PartialAxeResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-axe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest-axe", "axe")
  @js.native
  val axe: JestAxe = js.native
  
  inline def configureAxe(): JestAxe = ^.asInstanceOf[js.Dynamic].applyDynamic("configureAxe")().asInstanceOf[JestAxe]
  inline def configureAxe(options: JestAxeConfigureOptions): JestAxe = ^.asInstanceOf[js.Dynamic].applyDynamic("configureAxe")(options.asInstanceOf[js.Any]).asInstanceOf[JestAxe]
  
  object toHaveNoViolations {
    
    @JSImport("jest-axe", "toHaveNoViolations")
    @js.native
    val ^ : js.Any = js.native
    inline def toHaveNoViolations(): AssertionsResult = ^.asInstanceOf[js.Dynamic].applyDynamic("toHaveNoViolations")().asInstanceOf[AssertionsResult]
    inline def toHaveNoViolations(results: PartialAxeResults): AssertionsResult = ^.asInstanceOf[js.Dynamic].applyDynamic("toHaveNoViolations")(results.asInstanceOf[js.Any]).asInstanceOf[AssertionsResult]
    @JSImport("jest-axe", "toHaveNoViolations.toHaveNoViolations")
    @js.native
    def toHaveNoViolations_FtoHaveNoViolations: IToHaveNoViolations = js.native
    
    inline def toHaveNoViolations_FtoHaveNoViolations_=(x: IToHaveNoViolations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toHaveNoViolations")(x.asInstanceOf[js.Any])
  }
  
  trait AssertionsResult extends StObject {
    
    /**
      * Actual checked aXe verification results.
      */
    var actual: js.Array[Result]
    
    /**
      * @returns Message from the Jest assertion.
      */
    def message(): String
    
    /**
      * Whether the assertion passed.
      */
    var pass: Boolean
  }
  object AssertionsResult {
    
    inline def apply(actual: js.Array[Result], message: CallbackTo[String], pass: Boolean): AssertionsResult = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], message = message.toJsFn, pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssertionsResult]
    }
    
    extension [Self <: AssertionsResult](x: Self) {
      
      inline def setActual(value: js.Array[Result]): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setActualVarargs(value: Result*): Self = StObject.set(x, "actual", js.Array(value*))
      
      inline def setMessage(value: CallbackTo[String]): Self = StObject.set(x, "message", value.toJsFn)
      
      inline def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
  
  type IToHaveNoViolations = js.Function1[/* results */ js.UndefOr[PartialAxeResults], AssertionsResult]
  
  type JestAxe = js.Function2[
    /* html */ Element | String, 
    /* options */ js.UndefOr[RunOptions], 
    js.Promise[AxeResults]
  ]
  
  trait JestAxeConfigureOptions
    extends StObject
       with RunOptions {
    
    var globalOptions: js.UndefOr[Spec] = js.undefined
    
    var impactLevels: js.UndefOr[js.Array[ImpactValue]] = js.undefined
  }
  object JestAxeConfigureOptions {
    
    inline def apply(): JestAxeConfigureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JestAxeConfigureOptions]
    }
    
    extension [Self <: JestAxeConfigureOptions](x: Self) {
      
      inline def setGlobalOptions(value: Spec): Self = StObject.set(x, "globalOptions", value.asInstanceOf[js.Any])
      
      inline def setGlobalOptionsUndefined: Self = StObject.set(x, "globalOptions", js.undefined)
      
      inline def setImpactLevels(value: js.Array[ImpactValue]): Self = StObject.set(x, "impactLevels", value.asInstanceOf[js.Any])
      
      inline def setImpactLevelsUndefined: Self = StObject.set(x, "impactLevels", js.undefined)
      
      inline def setImpactLevelsVarargs(value: ImpactValue*): Self = StObject.set(x, "impactLevels", js.Array(value*))
    }
  }
  
  object global {
    
    object jest {
      
      trait Matchers[R, T] extends StObject {
        
        def toHaveNoViolations(): R
      }
      object Matchers {
        
        inline def apply[R, T](toHaveNoViolations: CallbackTo[R]): Matchers[R, T] = {
          val __obj = js.Dynamic.literal(toHaveNoViolations = toHaveNoViolations.toJsFn)
          __obj.asInstanceOf[Matchers[R, T]]
        }
        
        extension [Self <: Matchers[?, ?], R, T](x: Self & (Matchers[R, T])) {
          
          inline def setToHaveNoViolations(value: CallbackTo[R]): Self = StObject.set(x, "toHaveNoViolations", value.toJsFn)
        }
      }
    }
  }
}
