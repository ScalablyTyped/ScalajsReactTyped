package typingsJapgolly.argparse

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.argparse.mod.Action
import typingsJapgolly.argparse.mod.ActionConstructorOptions
import typingsJapgolly.argparse.mod.ArgumentDefaultsHelpFormatter
import typingsJapgolly.argparse.mod.HelpFormatter
import typingsJapgolly.argparse.mod.RawDescriptionHelpFormatter
import typingsJapgolly.argparse.mod.RawTextHelpFormatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0`
    extends StObject
       with Instantiable0[
          HelpFormatter | ArgumentDefaultsHelpFormatter | RawDescriptionHelpFormatter | RawTextHelpFormatter
        ]
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* options */ ActionConstructorOptions, Action]
  
  @js.native
  trait InstantiableAny
    extends StObject
       with Instantiable0[Any]
  
  trait Required extends StObject {
    
    var required: Boolean
  }
  object Required {
    
    inline def apply(required: Boolean): Required = {
      val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
      __obj.asInstanceOf[Required]
    }
    
    extension [Self <: Required](x: Self) {
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    }
  }
}
