package typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod

import typingsJapgolly.awsGreengrassCoreSdk.awsGreengrassCoreSdkInts.`0`
import typingsJapgolly.awsGreengrassCoreSdk.awsGreengrassCoreSdkInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistenceOptions extends StObject {
  
  var File: `0`
  
  var Memory: `1`
}
object PersistenceOptions {
  
  inline def apply(): PersistenceOptions = {
    val __obj = js.Dynamic.literal(File = 0, Memory = 1)
    __obj.asInstanceOf[PersistenceOptions]
  }
  
  extension [Self <: PersistenceOptions](x: Self) {
    
    inline def setFile(value: `0`): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
    
    inline def setMemory(value: `1`): Self = StObject.set(x, "Memory", value.asInstanceOf[js.Any])
  }
}
