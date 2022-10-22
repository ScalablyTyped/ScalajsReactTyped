package typingsJapgolly.semanticUiShape.anon

import typingsJapgolly.semanticUiShape.JQuery
import typingsJapgolly.semanticUiShape.SemanticUI.Shape.ClassNameSettings
import typingsJapgolly.semanticUiShape.SemanticUI.Shape.ErrorSettings
import typingsJapgolly.semanticUiShape.SemanticUI.Shape.SelectorSettings
import typingsJapgolly.semanticUiShape.SemanticUI.ShapeSettings.Param
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.initial
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.ShapeSettings._Impl, 'duration'> & std.Partial<std.Pick<semantic-ui-shape.SemanticUI.ShapeSettings._Impl, keyof semantic-ui-shape.SemanticUI.ShapeSettings._Impl>> */
trait PickImpldurationPartialPi
  extends StObject
     with Param {
  
  var beforeChange: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var duration: Double & js.UndefOr[Double]
  
  var error: js.UndefOr[ErrorSettings] = js.undefined
  
  var height: js.UndefOr[next | initial | Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var namespace: js.UndefOr[String] = js.undefined
  
  var onChange: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  
  var performance: js.UndefOr[Boolean] = js.undefined
  
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[next | initial | Double] = js.undefined
}
object PickImpldurationPartialPi {
  
  inline def apply(duration: Double & js.UndefOr[Double]): PickImpldurationPartialPi = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldurationPartialPi]
  }
  
  extension [Self <: PickImpldurationPartialPi](x: Self) {
    
    inline def setBeforeChange(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "beforeChange", value.asInstanceOf[js.Any])
    
    inline def setBeforeChangeUndefined: Self = StObject.set(x, "beforeChange", js.undefined)
    
    inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDuration(value: Double & js.UndefOr[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setHeight(value: next | initial | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setOnChange(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    
    inline def setWidth(value: next | initial | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
