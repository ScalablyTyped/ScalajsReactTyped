package typingsJapgolly.typescriptServices.mod.Services

import typingsJapgolly.typescriptServices.TypeScript.Services.IClassifierHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.Classifier")
@js.native
open class Classifier protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.Services.Classifier {
  def this(host: IClassifierHost) = this()
  
  /* private */ /* CompleteClass */
  override def addResult(text: Any, offset: Any, result: Any, length: Any, kind: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  var characterWindow: Any = js.native
  
  /* private */ /* CompleteClass */
  override def classFromKind(kind: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  var diagnostics: Any = js.native
  
  /* CompleteClass */
  override def getClassificationsForLine(text: String, lexState: typingsJapgolly.typescriptServices.TypeScript.Services.EndOfLineState): typingsJapgolly.typescriptServices.TypeScript.Services.ClassificationResult = js.native
  
  /* CompleteClass */
  var host: IClassifierHost = js.native
  
  /* private */ /* CompleteClass */
  override def processToken(text: Any, offset: Any, token: Any, result: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def processTriviaList(text: Any, offset: Any, triviaList: Any, result: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  var scanner: Any = js.native
}
