package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Budget
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.webpack.mod.StatsCompilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsBundleCalculatorMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/bundle-calculator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ThresholdSeverity extends StObject
  @JSImport("@angular-devkit/build-angular/src/utils/bundle-calculator", "ThresholdSeverity")
  @js.native
  object ThresholdSeverity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ThresholdSeverity & String] = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with ThresholdSeverity
    /* "error" */ val Error: typingsJapgolly.angularDevkitBuildAngular.srcUtilsBundleCalculatorMod.ThresholdSeverity.Error & String = js.native
    
    @js.native
    sealed trait Warning
      extends StObject
         with ThresholdSeverity
    /* "warning" */ val Warning: typingsJapgolly.angularDevkitBuildAngular.srcUtilsBundleCalculatorMod.ThresholdSeverity.Warning & String = js.native
  }
  
  @js.native
  sealed trait ThresholdType extends StObject
  @JSImport("@angular-devkit/build-angular/src/utils/bundle-calculator", "ThresholdType")
  @js.native
  object ThresholdType extends StObject {
    
    @js.native
    sealed trait Max
      extends StObject
         with ThresholdType
    
    @js.native
    sealed trait Min
      extends StObject
         with ThresholdType
  }
  
  inline def calculateThresholds(budget: Budget): IterableIterator[Threshold] = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateThresholds")(budget.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[Threshold]]
  
  inline def checkBudgets(budgets: js.Array[Budget], webpackStats: StatsCompilation): IterableIterator[BudgetCalculatorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkBudgets")(budgets.asInstanceOf[js.Any], webpackStats.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[BudgetCalculatorResult]]
  
  inline def checkThresholds(thresholds: IterableIterator[Threshold], size: Double): IterableIterator[BudgetCalculatorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkThresholds")(thresholds.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[BudgetCalculatorResult]]
  inline def checkThresholds(thresholds: IterableIterator[Threshold], size: Double, label: String): IterableIterator[BudgetCalculatorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkThresholds")(thresholds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[BudgetCalculatorResult]]
  
  trait BudgetCalculatorResult extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var message: String
    
    var severity: ThresholdSeverity
  }
  object BudgetCalculatorResult {
    
    inline def apply(message: String, severity: ThresholdSeverity): BudgetCalculatorResult = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
      __obj.asInstanceOf[BudgetCalculatorResult]
    }
    
    extension [Self <: BudgetCalculatorResult](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSeverity(value: ThresholdSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    }
  }
  
  trait Threshold extends StObject {
    
    var limit: Double
    
    var severity: ThresholdSeverity
    
    var `type`: ThresholdType
  }
  object Threshold {
    
    inline def apply(limit: Double, severity: ThresholdSeverity, `type`: ThresholdType): Threshold = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Threshold]
    }
    
    extension [Self <: Threshold](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setSeverity(value: ThresholdSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setType(value: ThresholdType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
