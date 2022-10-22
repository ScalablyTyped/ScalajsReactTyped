package typingsJapgolly.expoConstants

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.expoConstants.buildConstantsDottypesMod.Constants
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("expo-constants", JSImport.Default)
  @js.native
  val default: Constants = js.native
  
  @JSImport("expo-constants", "AppOwnership")
  @js.native
  object AppOwnership extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expoConstants.buildConstantsDottypesMod.AppOwnership & String] = js.native
    
    /* "expo" */ val Expo: typingsJapgolly.expoConstants.buildConstantsDottypesMod.AppOwnership.Expo & String = js.native
    
    /* "guest" */ val Guest: typingsJapgolly.expoConstants.buildConstantsDottypesMod.AppOwnership.Guest & String = js.native
    
    /* "standalone" */ val Standalone: typingsJapgolly.expoConstants.buildConstantsDottypesMod.AppOwnership.Standalone & String = js.native
  }
  
  @JSImport("expo-constants", "ExecutionEnvironment")
  @js.native
  object ExecutionEnvironment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.expoConstants.buildConstantsDottypesMod.ExecutionEnvironment & String
      ] = js.native
    
    /* "bare" */ val Bare: typingsJapgolly.expoConstants.buildConstantsDottypesMod.ExecutionEnvironment.Bare & String = js.native
    
    /* "standalone" */ val Standalone: typingsJapgolly.expoConstants.buildConstantsDottypesMod.ExecutionEnvironment.Standalone & String = js.native
    
    /* "storeClient" */ val StoreClient: typingsJapgolly.expoConstants.buildConstantsDottypesMod.ExecutionEnvironment.StoreClient & String = js.native
  }
  
  @JSImport("expo-constants", "UserInterfaceIdiom")
  @js.native
  object UserInterfaceIdiom extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.expoConstants.buildConstantsDottypesMod.UserInterfaceIdiom & String
      ] = js.native
    
    /* "handset" */ val Handset: typingsJapgolly.expoConstants.buildConstantsDottypesMod.UserInterfaceIdiom.Handset & String = js.native
    
    /* "tablet" */ val Tablet: typingsJapgolly.expoConstants.buildConstantsDottypesMod.UserInterfaceIdiom.Tablet & String = js.native
    
    /* "unsupported" */ val Unsupported: typingsJapgolly.expoConstants.buildConstantsDottypesMod.UserInterfaceIdiom.Unsupported & String = js.native
  }
  
  type _To = Constants
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Constants = default
}
