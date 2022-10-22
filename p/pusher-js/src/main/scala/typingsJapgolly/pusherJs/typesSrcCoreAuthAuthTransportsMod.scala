package typingsJapgolly.pusherJs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pusherJs.typesSrcCoreAuthOptionsMod.AuthRequestType
import typingsJapgolly.pusherJs.typesSrcCoreAuthOptionsMod.InternalAuthOptions
import typingsJapgolly.pusherJs.typesSrcRuntimesInterfaceMod.Runtime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreAuthAuthTransportsMod {
  
  type AuthTransport = js.Function5[
    /* context */ Runtime, 
    /* query */ String, 
    /* authOptions */ InternalAuthOptions, 
    /* authRequestType */ AuthRequestType, 
    /* callback */ js.Function, 
    Unit
  ]
  
  type AuthTransports = StringDictionary[AuthTransport]
}
