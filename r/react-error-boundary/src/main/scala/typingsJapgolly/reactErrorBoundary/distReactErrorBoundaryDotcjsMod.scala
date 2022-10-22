package typingsJapgolly.reactErrorBoundary

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactErrorBoundary.mod.ErrorBoundaryProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReactErrorBoundaryDotcjsMod {
  
  @JSImport("react-error-boundary/dist/react-error-boundary.cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useErrorHandler(): js.Function1[/* error */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useErrorHandler")().asInstanceOf[js.Function1[/* error */ Any, Unit]]
  inline def useErrorHandler(givenError: Any): js.Function1[/* error */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useErrorHandler")(givenError.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* error */ Any, Unit]]
  
  inline def withErrorBoundary[P](Component: ComponentType[P], errorBoundaryProps: ErrorBoundaryProps): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("withErrorBoundary")(Component.asInstanceOf[js.Any], errorBoundaryProps.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
}
