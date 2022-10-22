package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNotebookInstanceOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notebook instance. 
    */
  var NotebookInstanceArn: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.NotebookInstanceArn] = js.undefined
}
object CreateNotebookInstanceOutput {
  
  inline def apply(): CreateNotebookInstanceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotebookInstanceOutput]
  }
  
  extension [Self <: CreateNotebookInstanceOutput](x: Self) {
    
    inline def setNotebookInstanceArn(value: NotebookInstanceArn): Self = StObject.set(x, "NotebookInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setNotebookInstanceArnUndefined: Self = StObject.set(x, "NotebookInstanceArn", js.undefined)
  }
}
