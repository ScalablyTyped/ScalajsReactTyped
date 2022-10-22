package typingsJapgolly.esbuild.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.esbuild.anon.Bytes
import typingsJapgolly.esbuild.anon.EntryPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metafile extends StObject {
  
  var inputs: StringDictionary[Bytes]
  
  var outputs: StringDictionary[EntryPoint]
}
object Metafile {
  
  inline def apply(inputs: StringDictionary[Bytes], outputs: StringDictionary[EntryPoint]): Metafile = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metafile]
  }
  
  extension [Self <: Metafile](x: Self) {
    
    inline def setInputs(value: StringDictionary[Bytes]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: StringDictionary[EntryPoint]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
  }
}
