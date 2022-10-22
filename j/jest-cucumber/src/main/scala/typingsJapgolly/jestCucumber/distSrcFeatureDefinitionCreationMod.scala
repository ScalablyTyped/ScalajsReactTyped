package typingsJapgolly.jestCucumber

import japgolly.scalajs.react.Callback
import typingsJapgolly.jestCucumber.distSrcModelsMod.ParsedFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFeatureDefinitionCreationMod {
  
  @JSImport("jest-cucumber/dist/src/feature-definition-creation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defineFeature(featureFromFile: ParsedFeature, scenariosDefinitionCallback: ScenariosDefinitionCallbackFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineFeature")(featureFromFile.asInstanceOf[js.Any], scenariosDefinitionCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type DefineScenarioFunction = js.Function3[
    /* scenarioTitle */ String, 
    /* stepsDefinitionCallback */ StepsDefinitionCallbackFunction, 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ]
  
  @js.native
  trait DefineScenarioFunctionWithAliases extends DefineScenarioFunction {
    
    def concurrent(scenarioTitle: String, stepsDefinitionCallback: StepsDefinitionCallbackFunction): Unit = js.native
    def concurrent(scenarioTitle: String, stepsDefinitionCallback: StepsDefinitionCallbackFunction, timeout: Double): Unit = js.native
    @JSName("concurrent")
    var concurrent_Original: DefineScenarioFunction = js.native
    
    def only(scenarioTitle: String, stepsDefinitionCallback: StepsDefinitionCallbackFunction): Unit = js.native
    def only(scenarioTitle: String, stepsDefinitionCallback: StepsDefinitionCallbackFunction, timeout: Double): Unit = js.native
    @JSName("only")
    var only_Original: DefineScenarioFunction = js.native
    
    def skip(scenarioTitle: String, stepsDefinitionCallback: StepsDefinitionCallbackFunction): Unit = js.native
    def skip(scenarioTitle: String, stepsDefinitionCallback: StepsDefinitionCallbackFunction, timeout: Double): Unit = js.native
    @JSName("skip")
    var skip_Original: DefineScenarioFunction = js.native
  }
  
  type DefineStepFunction = js.Function2[
    /* stepMatcher */ String | js.RegExp, 
    /* stepDefinitionCallback */ js.Function1[/* repeated */ Any, Any], 
    Any
  ]
  
  type ScenariosDefinitionCallbackFunction = js.Function1[/* defineScenario */ DefineScenarioFunctionWithAliases, Unit]
  
  type StepsDefinitionCallbackFunction = js.Function1[/* options */ StepsDefinitionCallbackOptions, Unit]
  
  trait StepsDefinitionCallbackOptions extends StObject {
    
    def and(stepMatcher: String, stepDefinitionCallback: js.Function1[/* repeated */ Any, Any]): Any
    def and(stepMatcher: js.RegExp, stepDefinitionCallback: js.Function1[/* repeated */ Any, Any]): Any
    @JSName("and")
    var and_Original: DefineStepFunction
    
    def but(stepMatcher: String, stepDefinitionCallback: js.Function1[/* repeated */ Any, Any]): Any
    def but(stepMatcher: js.RegExp, stepDefinitionCallback: js.Function1[/* repeated */ Any, Any]): Any
    @JSName("but")
    var but_Original: DefineStepFunction
    
    def defineStep(stepMatcher: String, stepDefinitionCallback: js.Function1[/* repeated */ Any, Any]): Any
    def defineStep(stepMatcher: js.RegExp, stepDefinitionCallback: js.Function1[/* repeated */ Any, Any]): Any
    @JSName("defineStep")
    var defineStep_Original: DefineStepFunction
    
    def `given`(stepMatcher: String, stepDefinitionCallback: js.Function1[/* repeated */ Any, Any]): Any
    def `given`(stepMatcher: js.RegExp, stepDefinitionCallback: js.Function1[/* repeated */ Any, Any]): Any
    @JSName("given")
    var given_Original: DefineStepFunction
    
    def pending(): Unit
    
    def `then`(stepMatcher: String, stepDefinitionCallback: js.Function1[/* repeated */ Any, Any]): Any
    def `then`(stepMatcher: js.RegExp, stepDefinitionCallback: js.Function1[/* repeated */ Any, Any]): Any
    @JSName("then")
    var then_Original: DefineStepFunction
    
    def when(stepMatcher: String, stepDefinitionCallback: js.Function1[/* repeated */ Any, Any]): Any
    def when(stepMatcher: js.RegExp, stepDefinitionCallback: js.Function1[/* repeated */ Any, Any]): Any
    @JSName("when")
    var when_Original: DefineStepFunction
  }
  object StepsDefinitionCallbackOptions {
    
    inline def apply(
      and: (/* stepMatcher */ String | js.RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ Any, Any]) => Any,
      but: (/* stepMatcher */ String | js.RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ Any, Any]) => Any,
      defineStep: (/* stepMatcher */ String | js.RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ Any, Any]) => Any,
      `given`: (/* stepMatcher */ String | js.RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ Any, Any]) => Any,
      pending: Callback,
      `then`: (/* stepMatcher */ String | js.RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ Any, Any]) => Any,
      when: (/* stepMatcher */ String | js.RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ Any, Any]) => Any
    ): StepsDefinitionCallbackOptions = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction2(and), but = js.Any.fromFunction2(but), defineStep = js.Any.fromFunction2(defineStep), pending = pending.toJsFn, when = js.Any.fromFunction2(when))
      __obj.updateDynamic("given")(js.Any.fromFunction2(`given`))
      __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
      __obj.asInstanceOf[StepsDefinitionCallbackOptions]
    }
    
    extension [Self <: StepsDefinitionCallbackOptions](x: Self) {
      
      inline def setAnd(
        value: (/* stepMatcher */ String | js.RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ Any, Any]) => Any
      ): Self = StObject.set(x, "and", js.Any.fromFunction2(value))
      
      inline def setBut(
        value: (/* stepMatcher */ String | js.RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ Any, Any]) => Any
      ): Self = StObject.set(x, "but", js.Any.fromFunction2(value))
      
      inline def setDefineStep(
        value: (/* stepMatcher */ String | js.RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ Any, Any]) => Any
      ): Self = StObject.set(x, "defineStep", js.Any.fromFunction2(value))
      
      inline def setGiven(
        value: (/* stepMatcher */ String | js.RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ Any, Any]) => Any
      ): Self = StObject.set(x, "given", js.Any.fromFunction2(value))
      
      inline def setPending(value: Callback): Self = StObject.set(x, "pending", value.toJsFn)
      
      inline def setThen(
        value: (/* stepMatcher */ String | js.RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ Any, Any]) => Any
      ): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
      
      inline def setWhen(
        value: (/* stepMatcher */ String | js.RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ Any, Any]) => Any
      ): Self = StObject.set(x, "when", js.Any.fromFunction2(value))
    }
  }
}
