package typingsJapgolly.whichPm

import typingsJapgolly.whichPm.whichPmStrings.npm
import typingsJapgolly.whichPm.whichPmStrings.pnpm
import typingsJapgolly.whichPm.whichPmStrings.yarn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(pkgPath: String): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].apply(pkgPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @JSImport("which-pm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait NPM
    extends StObject
       with Result {
    
    val name: npm
  }
  object NPM {
    
    inline def apply(): NPM = {
      val __obj = js.Dynamic.literal(name = "npm")
      __obj.asInstanceOf[NPM]
    }
    
    extension [Self <: NPM](x: Self) {
      
      inline def setName(value: npm): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Other
    extends StObject
       with Result {
    
    val name: String
    
    val version: js.UndefOr[String] = js.undefined
  }
  object Other {
    
    inline def apply(name: String): Other = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Other]
    }
    
    extension [Self <: Other](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait PNPM
    extends StObject
       with Result {
    
    val name: pnpm
    
    val version: String
  }
  object PNPM {
    
    inline def apply(version: String): PNPM = {
      val __obj = js.Dynamic.literal(name = "pnpm", version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PNPM]
    }
    
    extension [Self <: PNPM](x: Self) {
      
      inline def setName(value: pnpm): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.whichPm.mod.NPM
    - typingsJapgolly.whichPm.mod.YARN
    - typingsJapgolly.whichPm.mod.PNPM
    - typingsJapgolly.whichPm.mod.Other
  */
  trait Result extends StObject
  object Result {
    
    inline def NPM(): typingsJapgolly.whichPm.mod.NPM = {
      val __obj = js.Dynamic.literal(name = "npm")
      __obj.asInstanceOf[typingsJapgolly.whichPm.mod.NPM]
    }
    
    inline def Other(name: String): typingsJapgolly.whichPm.mod.Other = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.whichPm.mod.Other]
    }
    
    inline def PNPM(version: String): typingsJapgolly.whichPm.mod.PNPM = {
      val __obj = js.Dynamic.literal(name = "pnpm", version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.whichPm.mod.PNPM]
    }
    
    inline def YARN(): typingsJapgolly.whichPm.mod.YARN = {
      val __obj = js.Dynamic.literal(name = "yarn")
      __obj.asInstanceOf[typingsJapgolly.whichPm.mod.YARN]
    }
  }
  
  trait YARN
    extends StObject
       with Result {
    
    val name: yarn
  }
  object YARN {
    
    inline def apply(): YARN = {
      val __obj = js.Dynamic.literal(name = "yarn")
      __obj.asInstanceOf[YARN]
    }
    
    extension [Self <: YARN](x: Self) {
      
      inline def setName(value: yarn): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
