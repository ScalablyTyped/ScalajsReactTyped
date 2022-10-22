package typingsJapgolly.hubot

import typingsJapgolly.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Hubot {
    
    @JSGlobal("Hubot.Adapter")
    @js.native
    open class Adapter protected ()
      extends typingsJapgolly.hubot.mod.Adapter {
      def this(robot: typingsJapgolly.hubot.mod.Robot[typingsJapgolly.hubot.mod.Adapter]) = this()
    }
    
    @JSGlobal("Hubot.Brain")
    @js.native
    open class Brain[A /* <: typingsJapgolly.hubot.mod.Adapter */] protected ()
      extends typingsJapgolly.hubot.mod.Brain[A] {
      def this(robot: typingsJapgolly.hubot.mod.Robot[A]) = this()
    }
    
    @JSGlobal("Hubot.CatchAllMessage")
    @js.native
    open class CatchAllMessage protected ()
      extends typingsJapgolly.hubot.mod.CatchAllMessage {
      def this(message: typingsJapgolly.hubot.mod.Message) = this()
    }
    
    @JSGlobal("Hubot.DataStore")
    @js.native
    open class DataStore protected ()
      extends typingsJapgolly.hubot.mod.DataStore {
      def this(robot: typingsJapgolly.hubot.mod.Robot[typingsJapgolly.hubot.mod.Adapter]) = this()
    }
    
    @JSGlobal("Hubot.DataStoreUnavailable")
    @js.native
    open class DataStoreUnavailable ()
      extends typingsJapgolly.hubot.mod.DataStoreUnavailable
    
    @JSGlobal("Hubot.EnterMessage")
    @js.native
    open class EnterMessage protected ()
      extends typingsJapgolly.hubot.mod.EnterMessage {
      def this(user: typingsJapgolly.hubot.mod.User) = this()
      def this(user: typingsJapgolly.hubot.mod.User, done: Boolean) = this()
    }
    
    @JSGlobal("Hubot.LeaveMessage")
    @js.native
    open class LeaveMessage protected ()
      extends typingsJapgolly.hubot.mod.LeaveMessage {
      def this(user: typingsJapgolly.hubot.mod.User) = this()
      def this(user: typingsJapgolly.hubot.mod.User, done: Boolean) = this()
    }
    
    @JSGlobal("Hubot.Message")
    @js.native
    open class Message protected ()
      extends typingsJapgolly.hubot.mod.Message {
      def this(user: typingsJapgolly.hubot.mod.User) = this()
      def this(user: typingsJapgolly.hubot.mod.User, done: Boolean) = this()
    }
    
    @JSGlobal("Hubot.Middleware")
    @js.native
    open class Middleware[T /* <: typingsJapgolly.hubot.mod.Adapter */] protected ()
      extends typingsJapgolly.hubot.mod.Middleware[T] {
      def this(robot: typingsJapgolly.hubot.mod.Robot[T]) = this()
    }
    
    @JSGlobal("Hubot.Response")
    @js.native
    open class Response[A /* <: typingsJapgolly.hubot.mod.Adapter */, M /* <: typingsJapgolly.hubot.mod.Message */] protected ()
      extends typingsJapgolly.hubot.mod.Response[A, M] {
      def this(
        robot: typingsJapgolly.hubot.mod.Robot[A],
        message: typingsJapgolly.hubot.mod.Message,
        `match`: RegExpMatchArray
      ) = this()
    }
    
    @JSGlobal("Hubot.Robot")
    @js.native
    open class Robot[A /* <: typingsJapgolly.hubot.mod.Adapter */] protected ()
      extends typingsJapgolly.hubot.mod.Robot[A] {
      def this(adapterPath: String, adapter: String, httpd: Boolean, name: String) = this()
      def this(adapterPath: String, adapter: String, httpd: Boolean, name: String, alias: String) = this()
    }
    
    @JSGlobal("Hubot.TextMessage")
    @js.native
    open class TextMessage protected ()
      extends typingsJapgolly.hubot.mod.TextMessage {
      def this(user: typingsJapgolly.hubot.mod.User, text: String, id: String) = this()
    }
    
    @JSGlobal("Hubot.TopicMessage")
    @js.native
    open class TopicMessage protected ()
      extends typingsJapgolly.hubot.mod.TopicMessage {
      def this(user: typingsJapgolly.hubot.mod.User, text: String, id: String) = this()
    }
    
    @JSGlobal("Hubot.User")
    @js.native
    open class User protected ()
      extends typingsJapgolly.hubot.mod.User {
      def this(id: String) = this()
      def this(id: String, options: js.Object) = this()
    }
  }
}
