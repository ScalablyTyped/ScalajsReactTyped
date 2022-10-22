package typingsJapgolly.typescriptServices.global.TypeScript.Services

import typingsJapgolly.typescriptServices.TypeScript.Services.IClassifierHost
import typingsJapgolly.typescriptServices.TypeScript.Services.IShimFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.ClassifierShim")
@js.native
open class ClassifierShim protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.Services.ClassifierShim {
  def this(factory: IShimFactory, host: IClassifierHost) = this()
  
  /* CompleteClass */
  var classifier: typingsJapgolly.typescriptServices.TypeScript.Services.Classifier = js.native
  
  /* CompleteClass */
  override def dispose(dummy: Any): Unit = js.native
  
  /* private */ /* CompleteClass */
  var factory: Any = js.native
  
  /* CompleteClass */
  override def getClassificationsForLine(text: String, lexState: typingsJapgolly.typescriptServices.TypeScript.Services.EndOfLineState): String = js.native
  
  /* CompleteClass */
  var host: IClassifierHost = js.native
}
