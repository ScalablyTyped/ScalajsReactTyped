package typingsJapgolly.meteor

import typingsJapgolly.meteor.anon.PartialWithLoggingInProps
import typingsJapgolly.meteor.anon.PartialWithLoggingOutProp
import typingsJapgolly.meteor.anon.PartialWithUserIdProps
import typingsJapgolly.meteor.anon.PartialWithUserProps
import typingsJapgolly.meteor.meteorMod.Meteor.User_
import typingsJapgolly.meteor.meteorStrings.loggingIn
import typingsJapgolly.meteor.meteorStrings.loggingOut
import typingsJapgolly.meteor.meteorStrings.user
import typingsJapgolly.meteor.meteorStrings.userId
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMeteorAccountsMod {
  
  @JSImport("meteor/react-meteor-accounts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useLoggingIn(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useLoggingIn")().asInstanceOf[Boolean]
  
  inline def useLoggingOut(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useLoggingOut")().asInstanceOf[Boolean]
  
  inline def useUser(): User_ | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useUser")().asInstanceOf[User_ | Null]
  
  inline def useUserId(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useUserId")().asInstanceOf[String | Null]
  
  inline def withLoggingIn[P](Component: ComponentType[P]): ForwardRefExoticComponent[
    (PropsWithoutRef[(Omit[P, loggingIn]) & PartialWithLoggingInProps]) & RefAttributes[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLoggingIn")(Component.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[(Omit[P, loggingIn]) & PartialWithLoggingInProps]) & RefAttributes[Any]
  ]]
  
  inline def withLoggingOut[P](Component: ComponentType[P]): ForwardRefExoticComponent[
    (PropsWithoutRef[(Omit[P, loggingOut]) & PartialWithLoggingOutProp]) & RefAttributes[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLoggingOut")(Component.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[(Omit[P, loggingOut]) & PartialWithLoggingOutProp]) & RefAttributes[Any]
  ]]
  
  inline def withUser[P](Component: ComponentType[P]): ForwardRefExoticComponent[(PropsWithoutRef[(Omit[P, user]) & PartialWithUserProps]) & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withUser")(Component.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[(PropsWithoutRef[(Omit[P, user]) & PartialWithUserProps]) & RefAttributes[Any]]]
  
  inline def withUserId[P](Component: ComponentType[P]): ForwardRefExoticComponent[
    (PropsWithoutRef[(Omit[P, userId]) & PartialWithUserIdProps]) & RefAttributes[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withUserId")(Component.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[(Omit[P, userId]) & PartialWithUserIdProps]) & RefAttributes[Any]
  ]]
  
  trait WithLoggingInProps extends StObject {
    
    var loggingIn: Boolean
  }
  object WithLoggingInProps {
    
    inline def apply(loggingIn: Boolean): WithLoggingInProps = {
      val __obj = js.Dynamic.literal(loggingIn = loggingIn.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithLoggingInProps]
    }
    
    extension [Self <: WithLoggingInProps](x: Self) {
      
      inline def setLoggingIn(value: Boolean): Self = StObject.set(x, "loggingIn", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithLoggingOutProps extends StObject {
    
    var loggingOut: Boolean
  }
  object WithLoggingOutProps {
    
    inline def apply(loggingOut: Boolean): WithLoggingOutProps = {
      val __obj = js.Dynamic.literal(loggingOut = loggingOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithLoggingOutProps]
    }
    
    extension [Self <: WithLoggingOutProps](x: Self) {
      
      inline def setLoggingOut(value: Boolean): Self = StObject.set(x, "loggingOut", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithUserIdProps extends StObject {
    
    var userId: String | Null
  }
  object WithUserIdProps {
    
    inline def apply(): WithUserIdProps = {
      val __obj = js.Dynamic.literal(userId = null)
      __obj.asInstanceOf[WithUserIdProps]
    }
    
    extension [Self <: WithUserIdProps](x: Self) {
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    }
  }
  
  trait WithUserProps extends StObject {
    
    var user: User_ | Null
  }
  object WithUserProps {
    
    inline def apply(): WithUserProps = {
      val __obj = js.Dynamic.literal(user = null)
      __obj.asInstanceOf[WithUserProps]
    }
    
    extension [Self <: WithUserProps](x: Self) {
      
      inline def setUser(value: User_): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserNull: Self = StObject.set(x, "user", null)
    }
  }
}
