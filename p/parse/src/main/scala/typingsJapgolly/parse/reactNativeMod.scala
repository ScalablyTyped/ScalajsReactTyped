package typingsJapgolly.parse

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.parse.anon.Base64
import typingsJapgolly.parse.anon.Instantiable
import typingsJapgolly.parse.anon.Latitude
import typingsJapgolly.parse.anon.Size
import typingsJapgolly.parse.anon.Uri
import typingsJapgolly.parse.mod.ErrorCode
import typingsJapgolly.parse.mod.ErrorCode.ACCOUNT_ALREADY_LINKED
import typingsJapgolly.parse.mod.ErrorCode.AGGREGATE_ERROR
import typingsJapgolly.parse.mod.ErrorCode.CACHE_MISS
import typingsJapgolly.parse.mod.ErrorCode.COMMAND_UNAVAILABLE
import typingsJapgolly.parse.mod.ErrorCode.CONNECTION_FAILED
import typingsJapgolly.parse.mod.ErrorCode.DUPLICATE_VALUE
import typingsJapgolly.parse.mod.ErrorCode.EMAIL_MISSING
import typingsJapgolly.parse.mod.ErrorCode.EMAIL_NOT_FOUND
import typingsJapgolly.parse.mod.ErrorCode.EMAIL_TAKEN
import typingsJapgolly.parse.mod.ErrorCode.EXCEEDED_QUOTA
import typingsJapgolly.parse.mod.ErrorCode.FILE_DELETE_ERROR
import typingsJapgolly.parse.mod.ErrorCode.FILE_READ_ERROR
import typingsJapgolly.parse.mod.ErrorCode.FILE_SAVE_ERROR
import typingsJapgolly.parse.mod.ErrorCode.FILE_TOO_LARGE
import typingsJapgolly.parse.mod.ErrorCode.INCORRECT_TYPE
import typingsJapgolly.parse.mod.ErrorCode.INTERNAL_SERVER_ERROR
import typingsJapgolly.parse.mod.ErrorCode.INVALID_ACL
import typingsJapgolly.parse.mod.ErrorCode.INVALID_CHANNEL_NAME
import typingsJapgolly.parse.mod.ErrorCode.INVALID_CLASS_NAME
import typingsJapgolly.parse.mod.ErrorCode.INVALID_CONTENT_LENGTH
import typingsJapgolly.parse.mod.ErrorCode.INVALID_EMAIL_ADDRESS
import typingsJapgolly.parse.mod.ErrorCode.INVALID_EVENT_NAME
import typingsJapgolly.parse.mod.ErrorCode.INVALID_FILE_NAME
import typingsJapgolly.parse.mod.ErrorCode.INVALID_IMAGE_DATA
import typingsJapgolly.parse.mod.ErrorCode.INVALID_JSON
import typingsJapgolly.parse.mod.ErrorCode.INVALID_KEY_NAME
import typingsJapgolly.parse.mod.ErrorCode.INVALID_LINKED_SESSION
import typingsJapgolly.parse.mod.ErrorCode.INVALID_NESTED_KEY
import typingsJapgolly.parse.mod.ErrorCode.INVALID_POINTER
import typingsJapgolly.parse.mod.ErrorCode.INVALID_PUSH_TIME_ERROR
import typingsJapgolly.parse.mod.ErrorCode.INVALID_QUERY
import typingsJapgolly.parse.mod.ErrorCode.INVALID_ROLE_NAME
import typingsJapgolly.parse.mod.ErrorCode.INVALID_SESSION_TOKEN
import typingsJapgolly.parse.mod.ErrorCode.LINKED_ID_MISSING
import typingsJapgolly.parse.mod.ErrorCode.MISSING_CONTENT_LENGTH
import typingsJapgolly.parse.mod.ErrorCode.MISSING_CONTENT_TYPE
import typingsJapgolly.parse.mod.ErrorCode.MISSING_OBJECT_ID
import typingsJapgolly.parse.mod.ErrorCode.MUST_CREATE_USER_THROUGH_SIGNUP
import typingsJapgolly.parse.mod.ErrorCode.NOT_INITIALIZED
import typingsJapgolly.parse.mod.ErrorCode.OBJECT_NOT_FOUND
import typingsJapgolly.parse.mod.ErrorCode.OBJECT_TOO_LARGE
import typingsJapgolly.parse.mod.ErrorCode.OPERATION_FORBIDDEN
import typingsJapgolly.parse.mod.ErrorCode.OTHER_CAUSE
import typingsJapgolly.parse.mod.ErrorCode.PASSWORD_MISSING
import typingsJapgolly.parse.mod.ErrorCode.PUSH_MISCONFIGURED
import typingsJapgolly.parse.mod.ErrorCode.REQUEST_LIMIT_EXCEEDED
import typingsJapgolly.parse.mod.ErrorCode.SCRIPT_FAILED
import typingsJapgolly.parse.mod.ErrorCode.SESSION_MISSING
import typingsJapgolly.parse.mod.ErrorCode.TIMEOUT
import typingsJapgolly.parse.mod.ErrorCode.UNSAVED_FILE_ERROR
import typingsJapgolly.parse.mod.ErrorCode.UNSUPPORTED_SERVICE
import typingsJapgolly.parse.mod.ErrorCode.USERNAME_MISSING
import typingsJapgolly.parse.mod.ErrorCode.USERNAME_TAKEN
import typingsJapgolly.parse.mod.ErrorCode.VALIDATION_ERROR
import typingsJapgolly.parse.mod.ErrorCode.X_DOMAIN_REQUEST
import typingsJapgolly.parse.mod.global.Parse.Attributes
import typingsJapgolly.parse.mod.global.Parse.Cloud.AfterDeleteRequest
import typingsJapgolly.parse.mod.global.Parse.Cloud.AfterFindRequest
import typingsJapgolly.parse.mod.global.Parse.Cloud.AfterSaveRequest
import typingsJapgolly.parse.mod.global.Parse.Cloud.BeforeDeleteRequest
import typingsJapgolly.parse.mod.global.Parse.Cloud.BeforeFindRequest
import typingsJapgolly.parse.mod.global.Parse.Cloud.BeforeSaveRequest
import typingsJapgolly.parse.mod.global.Parse.Cloud.FileTriggerRequest
import typingsJapgolly.parse.mod.global.Parse.Cloud.FunctionRequest
import typingsJapgolly.parse.mod.global.Parse.Cloud.HTTPOptions
import typingsJapgolly.parse.mod.global.Parse.Cloud.HttpResponse
import typingsJapgolly.parse.mod.global.Parse.Cloud.JobRequest
import typingsJapgolly.parse.mod.global.Parse.Cloud.Params
import typingsJapgolly.parse.mod.global.Parse.Cloud.RunOptions
import typingsJapgolly.parse.mod.global.Parse.Cloud.TriggerRequest
import typingsJapgolly.parse.mod.global.Parse.Cloud.Validator
import typingsJapgolly.parse.mod.global.Parse.FullOptions
import typingsJapgolly.parse.mod.global.Parse.InstallationConstructor
import typingsJapgolly.parse.mod.global.Parse.Object
import typingsJapgolly.parse.mod.global.Parse.ObjectConstructor
import typingsJapgolly.parse.mod.global.Parse.Push.PushData
import typingsJapgolly.parse.mod.global.Parse.Push.SendOptions
import typingsJapgolly.parse.mod.global.Parse.RestSchema
import typingsJapgolly.parse.mod.global.Parse.RoleConstructor
import typingsJapgolly.parse.mod.global.Parse.ScopeOptions
import typingsJapgolly.parse.mod.global.Parse.SessionConstructor
import typingsJapgolly.parse.mod.global.Parse.SuccessFailureOptions
import typingsJapgolly.parse.mod.global.Parse.UseMasterKeyOption
import typingsJapgolly.parse.mod.global.Parse.UserConstructor
import typingsJapgolly.std.Partial
import typingsJapgolly.std.PromiseLike
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeMod {
  
  @JSImport("parse/react-native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ACL.
    * If no argument is given, the ACL has no permissions for anyone.
    * If the argument is a Parse.User, the ACL will have read and write
    *   permission for only that user.
    * If the argument is any other JSON object, that object will be interpretted
    *   as a serialized ACL created with toJSON().
    * @see Parse.Object#setACL
    *
    * <p>An ACL, or Access Control List can be added to any
    * <code>Parse.Object</code> to restrict access to only a subset of users
    * of your application.</p>
    */
  @JSImport("parse/react-native", "ACL")
  @js.native
  open class ACL ()
    extends typingsJapgolly.parse.mod.ACL {
    def this(arg1: Any) = this()
  }
  
  object Analytics {
    
    @JSImport("parse/react-native", "Analytics")
    @js.native
    val ^ : js.Any = js.native
    
    inline def track(name: String, dimensions: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(name.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  }
  
  /**
    * Provides utility functions for working with Anonymously logged-in users.
    */
  object AnonymousUtils {
    
    @JSImport("parse/react-native", "AnonymousUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isLinked(user: typingsJapgolly.parse.mod.global.Parse.User[Attributes]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLinked")(user.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def link(user: typingsJapgolly.parse.mod.global.Parse.User[Attributes]): js.Promise[typingsJapgolly.parse.mod.global.Parse.User[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("link")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.parse.mod.global.Parse.User[Attributes]]]
    inline def link(user: typingsJapgolly.parse.mod.global.Parse.User[Attributes], options: ScopeOptions): js.Promise[typingsJapgolly.parse.mod.global.Parse.User[Attributes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(user.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.parse.mod.global.Parse.User[Attributes]]]
    
    inline def logIn(): js.Promise[typingsJapgolly.parse.mod.global.Parse.User[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("logIn")().asInstanceOf[js.Promise[typingsJapgolly.parse.mod.global.Parse.User[Attributes]]]
    inline def logIn(options: ScopeOptions): js.Promise[typingsJapgolly.parse.mod.global.Parse.User[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("logIn")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.parse.mod.global.Parse.User[Attributes]]]
  }
  
  /**
    * Contains functions for calling and declaring
    * <a href="/docs/cloud_code_guide#functions">cloud functions</a>.
    * <p><strong><em>
    *   Some functions are only available from Cloud Code.
    * </em></strong></p>
    */
  object Cloud {
    
    @JSImport("parse/react-native", "Cloud")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * To use this Cloud Module in Cloud Code, you must require 'buffer' in your JavaScript file.
      *
      *     import Buffer = require("buffer").Buffer;
      */
    @JSImport("parse/react-native", "Cloud.HTTPOptions")
    @js.native
    def HTTPOptions: Instantiable0[typingsJapgolly.parse.mod.global.Parse.Cloud.HTTPOptions] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("parse/react-native", "Cloud.HTTPOptions")
    @js.native
    open class HTTPOptionsCls ()
      extends StObject
         with HTTPOptions {
      
      /**
        * The url to send the request to.
        */
      /* CompleteClass */
      var url: String = js.native
    }
    
    inline def HTTPOptions_=(x: Instantiable0[HTTPOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTPOptions")(x.asInstanceOf[js.Any])
    
    // Read preference describes how MongoDB driver route read operations to the members of a replica set.
    @JSImport("parse/react-native", "Cloud.ReadPreferenceOption")
    @js.native
    object ReadPreferenceOption extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.parse.mod.global.Parse.Cloud.ReadPreferenceOption & String] = js.native
      
      /* "NEAREST" */ val Nearest: typingsJapgolly.parse.mod.global.Parse.Cloud.ReadPreferenceOption.Nearest & String = js.native
      
      /* "PRIMARY" */ val Primary: typingsJapgolly.parse.mod.global.Parse.Cloud.ReadPreferenceOption.Primary & String = js.native
      
      /* "PRIMARY_PREFERRED" */ val PrimaryPreferred: typingsJapgolly.parse.mod.global.Parse.Cloud.ReadPreferenceOption.PrimaryPreferred & String = js.native
      
      /* "SECONDARY" */ val Secondary: typingsJapgolly.parse.mod.global.Parse.Cloud.ReadPreferenceOption.Secondary & String = js.native
      
      /* "SECONDARY_PREFERRED" */ val SecondaryPreferred: typingsJapgolly.parse.mod.global.Parse.Cloud.ReadPreferenceOption.SecondaryPreferred & String = js.native
    }
    
    inline def afterDelete[T /* <: Object[Attributes] */](arg1: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def afterDelete[T /* <: Object[Attributes] */](arg1: String, func: js.Function1[/* request */ AfterDeleteRequest[T], js.Promise[Unit] | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterDelete[T /* <: Object[Attributes] */](
      arg1: String,
      func: js.Function1[/* request */ AfterDeleteRequest[T], js.Promise[Unit] | Unit],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterDelete[T /* <: Object[Attributes] */](
      arg1: String,
      func: js.Function1[/* request */ AfterDeleteRequest[T], js.Promise[Unit] | Unit],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterDelete[T /* <: Object[Attributes] */](arg1: String, func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterDelete[T /* <: Object[Attributes] */](arg1: String, func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterDelete[T /* <: Object[Attributes] */](arg1: Instantiable[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def afterDelete[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: js.Function1[/* request */ AfterDeleteRequest[T], js.Promise[Unit] | Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterDelete[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: js.Function1[/* request */ AfterDeleteRequest[T], js.Promise[Unit] | Unit],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterDelete[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: js.Function1[/* request */ AfterDeleteRequest[T], js.Promise[Unit] | Unit],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterDelete[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: Unit,
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterDelete[T /* <: Object[Attributes] */](arg1: Instantiable[T], func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def afterDeleteFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterDeleteFile")().asInstanceOf[Unit]
    inline def afterDeleteFile(func: js.Function1[/* request */ FileTriggerRequest, PromiseLike[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterDeleteFile")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def afterDeleteFile(
      func: js.Function1[/* request */ FileTriggerRequest, PromiseLike[Unit] | Unit],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDeleteFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterDeleteFile(
      func: js.Function1[/* request */ FileTriggerRequest, PromiseLike[Unit] | Unit],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDeleteFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterDeleteFile(func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDeleteFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterDeleteFile(func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDeleteFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def afterFind[T /* <: Object[Attributes] */](arg1: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def afterFind[T /* <: Object[Attributes] */](arg1: String, func: js.Function1[/* request */ AfterFindRequest[T], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterFind[T /* <: Object[Attributes] */](
      arg1: String,
      func: js.Function1[/* request */ AfterFindRequest[T], Any],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterFind[T /* <: Object[Attributes] */](arg1: String, func: js.Function1[/* request */ AfterFindRequest[T], Any], validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterFind[T /* <: Object[Attributes] */](arg1: String, func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterFind[T /* <: Object[Attributes] */](arg1: String, func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterFind[T /* <: Object[Attributes] */](arg1: Instantiable[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def afterFind[T /* <: Object[Attributes] */](arg1: Instantiable[T], func: js.Function1[/* request */ AfterFindRequest[T], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterFind[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: js.Function1[/* request */ AfterFindRequest[T], Any],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterFind[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: js.Function1[/* request */ AfterFindRequest[T], Any],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterFind[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: Unit,
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterFind[T /* <: Object[Attributes] */](arg1: Instantiable[T], func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def afterLogin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLogin")().asInstanceOf[Unit]
    inline def afterLogin(
      func: js.Function1[
          /* request */ TriggerRequest[typingsJapgolly.parse.mod.global.Parse.User[Attributes]], 
          PromiseLike[Unit] | Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLogin")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def afterLogin(
      func: js.Function1[
          /* request */ TriggerRequest[typingsJapgolly.parse.mod.global.Parse.User[Attributes]], 
          PromiseLike[Unit] | Unit
        ],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterLogin")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterLogin(
      func: js.Function1[
          /* request */ TriggerRequest[typingsJapgolly.parse.mod.global.Parse.User[Attributes]], 
          PromiseLike[Unit] | Unit
        ],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterLogin")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterLogin(func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterLogin")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterLogin(func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterLogin")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def afterLogout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLogout")().asInstanceOf[Unit]
    inline def afterLogout(
      func: js.Function1[
          /* request */ TriggerRequest[typingsJapgolly.parse.mod.global.Parse.Session[Attributes]], 
          PromiseLike[Unit] | Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLogout")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def afterLogout(
      func: js.Function1[
          /* request */ TriggerRequest[typingsJapgolly.parse.mod.global.Parse.Session[Attributes]], 
          PromiseLike[Unit] | Unit
        ],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterLogout")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterLogout(
      func: js.Function1[
          /* request */ TriggerRequest[typingsJapgolly.parse.mod.global.Parse.Session[Attributes]], 
          PromiseLike[Unit] | Unit
        ],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterLogout")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterLogout(func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterLogout")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterLogout(func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterLogout")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def afterSave[T /* <: Object[Attributes] */](arg1: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def afterSave[T /* <: Object[Attributes] */](arg1: String, func: js.Function1[/* request */ AfterSaveRequest[T], js.Promise[Unit] | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterSave[T /* <: Object[Attributes] */](
      arg1: String,
      func: js.Function1[/* request */ AfterSaveRequest[T], js.Promise[Unit] | Unit],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterSave[T /* <: Object[Attributes] */](
      arg1: String,
      func: js.Function1[/* request */ AfterSaveRequest[T], js.Promise[Unit] | Unit],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterSave[T /* <: Object[Attributes] */](arg1: String, func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterSave[T /* <: Object[Attributes] */](arg1: String, func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterSave[T /* <: Object[Attributes] */](arg1: Instantiable[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def afterSave[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: js.Function1[/* request */ AfterSaveRequest[T], js.Promise[Unit] | Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterSave[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: js.Function1[/* request */ AfterSaveRequest[T], js.Promise[Unit] | Unit],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterSave[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: js.Function1[/* request */ AfterSaveRequest[T], js.Promise[Unit] | Unit],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterSave[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: Unit,
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterSave[T /* <: Object[Attributes] */](arg1: Instantiable[T], func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def afterSaveFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterSaveFile")().asInstanceOf[Unit]
    inline def afterSaveFile(func: js.Function1[/* request */ FileTriggerRequest, PromiseLike[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterSaveFile")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def afterSaveFile(
      func: js.Function1[/* request */ FileTriggerRequest, PromiseLike[Unit] | Unit],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSaveFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterSaveFile(
      func: js.Function1[/* request */ FileTriggerRequest, PromiseLike[Unit] | Unit],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSaveFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterSaveFile(func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSaveFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterSaveFile(func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSaveFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def beforeDelete[T /* <: Object[Attributes] */](arg1: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def beforeDelete[T /* <: Object[Attributes] */](arg1: String, func: js.Function1[/* request */ BeforeDeleteRequest[T], js.Promise[Unit] | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeDelete[T /* <: Object[Attributes] */](
      arg1: String,
      func: js.Function1[/* request */ BeforeDeleteRequest[T], js.Promise[Unit] | Unit],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeDelete[T /* <: Object[Attributes] */](
      arg1: String,
      func: js.Function1[/* request */ BeforeDeleteRequest[T], js.Promise[Unit] | Unit],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeDelete[T /* <: Object[Attributes] */](arg1: String, func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeDelete[T /* <: Object[Attributes] */](arg1: String, func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeDelete[T /* <: Object[Attributes] */](arg1: Instantiable[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def beforeDelete[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: js.Function1[/* request */ BeforeDeleteRequest[T], js.Promise[Unit] | Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeDelete[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: js.Function1[/* request */ BeforeDeleteRequest[T], js.Promise[Unit] | Unit],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeDelete[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: js.Function1[/* request */ BeforeDeleteRequest[T], js.Promise[Unit] | Unit],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeDelete[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: Unit,
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeDelete[T /* <: Object[Attributes] */](arg1: Instantiable[T], func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def beforeDeleteFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeDeleteFile")().asInstanceOf[Unit]
    inline def beforeDeleteFile(func: js.Function1[/* request */ FileTriggerRequest, PromiseLike[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeDeleteFile")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def beforeDeleteFile(
      func: js.Function1[/* request */ FileTriggerRequest, PromiseLike[Unit] | Unit],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDeleteFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeDeleteFile(
      func: js.Function1[/* request */ FileTriggerRequest, PromiseLike[Unit] | Unit],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDeleteFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeDeleteFile(func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDeleteFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeDeleteFile(func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDeleteFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def beforeFind[T /* <: Object[Attributes] */](arg1: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def beforeFind[T /* <: Object[Attributes] */](
      arg1: String,
      func: js.Function1[
          /* request */ BeforeFindRequest[T], 
          (js.Promise[typingsJapgolly.parse.mod.global.Parse.Query[T] | Unit]) | typingsJapgolly.parse.mod.global.Parse.Query[T] | Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeFind[T /* <: Object[Attributes] */](
      arg1: String,
      func: js.Function1[
          /* request */ BeforeFindRequest[T], 
          (js.Promise[typingsJapgolly.parse.mod.global.Parse.Query[T] | Unit]) | typingsJapgolly.parse.mod.global.Parse.Query[T] | Unit
        ],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeFind[T /* <: Object[Attributes] */](
      arg1: String,
      func: js.Function1[
          /* request */ BeforeFindRequest[T], 
          (js.Promise[typingsJapgolly.parse.mod.global.Parse.Query[T] | Unit]) | typingsJapgolly.parse.mod.global.Parse.Query[T] | Unit
        ],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeFind[T /* <: Object[Attributes] */](arg1: String, func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeFind[T /* <: Object[Attributes] */](arg1: String, func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeFind[T /* <: Object[Attributes] */](arg1: Instantiable[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def beforeFind[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: js.Function1[
          /* request */ BeforeFindRequest[T], 
          (js.Promise[typingsJapgolly.parse.mod.global.Parse.Query[T] | Unit]) | typingsJapgolly.parse.mod.global.Parse.Query[T] | Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeFind[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: js.Function1[
          /* request */ BeforeFindRequest[T], 
          (js.Promise[typingsJapgolly.parse.mod.global.Parse.Query[T] | Unit]) | typingsJapgolly.parse.mod.global.Parse.Query[T] | Unit
        ],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeFind[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: js.Function1[
          /* request */ BeforeFindRequest[T], 
          (js.Promise[typingsJapgolly.parse.mod.global.Parse.Query[T] | Unit]) | typingsJapgolly.parse.mod.global.Parse.Query[T] | Unit
        ],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeFind[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: Unit,
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeFind[T /* <: Object[Attributes] */](arg1: Instantiable[T], func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def beforeLogin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeLogin")().asInstanceOf[Unit]
    inline def beforeLogin(
      func: js.Function1[
          /* request */ TriggerRequest[typingsJapgolly.parse.mod.global.Parse.User[Attributes]], 
          PromiseLike[Unit] | Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeLogin")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def beforeSave[T /* <: Object[Attributes] */](arg1: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def beforeSave[T /* <: Object[Attributes] */](arg1: String, func: js.Function1[/* request */ BeforeSaveRequest[T], js.Promise[Unit] | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeSave[T /* <: Object[Attributes] */](
      arg1: String,
      func: js.Function1[/* request */ BeforeSaveRequest[T], js.Promise[Unit] | Unit],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeSave[T /* <: Object[Attributes] */](
      arg1: String,
      func: js.Function1[/* request */ BeforeSaveRequest[T], js.Promise[Unit] | Unit],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeSave[T /* <: Object[Attributes] */](arg1: String, func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeSave[T /* <: Object[Attributes] */](arg1: String, func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeSave[T /* <: Object[Attributes] */](arg1: Instantiable[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def beforeSave[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: js.Function1[/* request */ BeforeSaveRequest[T], js.Promise[Unit] | Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeSave[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: js.Function1[/* request */ BeforeSaveRequest[T], js.Promise[Unit] | Unit],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeSave[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: js.Function1[/* request */ BeforeSaveRequest[T], js.Promise[Unit] | Unit],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeSave[T /* <: Object[Attributes] */](
      arg1: Instantiable[T],
      func: Unit,
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeSave[T /* <: Object[Attributes] */](arg1: Instantiable[T], func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def beforeSaveFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeSaveFile")().asInstanceOf[Unit]
    inline def beforeSaveFile(
      func: js.Function1[
          /* request */ FileTriggerRequest, 
          PromiseLike[typingsJapgolly.parse.mod.global.Parse.File] | Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeSaveFile")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def beforeSaveFile(
      func: js.Function1[
          /* request */ FileTriggerRequest, 
          PromiseLike[typingsJapgolly.parse.mod.global.Parse.File] | Unit
        ],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSaveFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeSaveFile(
      func: js.Function1[
          /* request */ FileTriggerRequest, 
          PromiseLike[typingsJapgolly.parse.mod.global.Parse.File] | Unit
        ],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSaveFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeSaveFile(func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSaveFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeSaveFile(func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSaveFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def define(name: String, func: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def define(
      name: String,
      func: js.Function1[/* request */ FunctionRequest[Params], Any],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def define(name: String, func: js.Function1[/* request */ FunctionRequest[Params], Any], validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def define_0[T /* <: js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]} */ /* param */ js.Any, 
        Any
      ] */](
      name: String,
      func: js.Function1[
          /* request */ FunctionRequest[
            /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any
          ], 
          js.Promise[ReturnType[T]] | ReturnType[T]
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def define_0[T /* <: js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]} */ /* param */ js.Any, 
        Any
      ] */](
      name: String,
      func: js.Function1[
          /* request */ FunctionRequest[
            /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any
          ], 
          js.Promise[ReturnType[T]] | ReturnType[T]
        ],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def define_0[T /* <: js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]} */ /* param */ js.Any, 
        Any
      ] */](
      name: String,
      func: js.Function1[
          /* request */ FunctionRequest[
            /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any
          ], 
          js.Promise[ReturnType[T]] | ReturnType[T]
        ],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def define_T[T /* <: js.Function0[Any] */](
      name: String,
      func: js.Function1[
          /* request */ FunctionRequest[js.Object], 
          js.Promise[ReturnType[T]] | ReturnType[T]
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def define_T[T /* <: js.Function0[Any] */](
      name: String,
      func: js.Function1[
          /* request */ FunctionRequest[js.Object], 
          js.Promise[ReturnType[T]] | ReturnType[T]
        ],
      validator: js.Function1[/* request */ FunctionRequest[Params], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def define_T[T /* <: js.Function0[Any] */](
      name: String,
      func: js.Function1[
          /* request */ FunctionRequest[js.Object], 
          js.Promise[ReturnType[T]] | ReturnType[T]
        ],
      validator: Validator
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Gets job status by Id
      * @param jobStatusId The Id of Job Status.
      * @returns Status of Job.
      */
    inline def getJobStatus(jobStatusId: String): js.Promise[Object[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJobStatus")(jobStatusId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Object[Attributes]]]
    
    /**
      * Gets data for the current set of cloud jobs.
      * @returns A promise that will be resolved with the result of the function.
      */
    inline def getJobsData(): js.Promise[Object[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJobsData")().asInstanceOf[js.Promise[Object[Attributes]]]
    
    inline def httpRequest(options: HTTPOptions): js.Promise[HttpResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("httpRequest")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HttpResponse]]
    
    inline def job(name: String): HttpResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("job")(name.asInstanceOf[js.Any]).asInstanceOf[HttpResponse]
    inline def job(name: String, func: js.Function1[/* request */ JobRequest[Params], js.Promise[Unit] | Unit]): HttpResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("job")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[HttpResponse]
    
    inline def run(name: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def run(name: String, data: Unit, options: RunOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def run(name: String, data: Params): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def run(name: String, data: Params, options: RunOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def run[T /* <: js.Function0[Any] */](name: String, data: Null, options: RunOptions): js.Promise[ReturnType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType[T]]]
    
    inline def run_0[T /* <: js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]} */ /* param */ js.Any, 
        Any
      ] */](
      name: String,
      data: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any
    ): js.Promise[ReturnType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType[T]]]
    inline def run_0[T /* <: js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]} */ /* param */ js.Any, 
        Any
      ] */](
      name: String,
      data: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any,
      options: RunOptions
    ): js.Promise[ReturnType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType[T]]]
    
    inline def run_T[T /* <: js.Function0[Any] */](name: String): js.Promise[ReturnType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType[T]]]
    inline def run_T[T /* <: js.Function0[Any] */](name: String, data: Unit, options: RunOptions): js.Promise[ReturnType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType[T]]]
    
    /**
      * Starts a given cloud job, which will process asynchronously.
      * @param jobName The function name.
      * @param data The parameters to send to the cloud function.
      * @returns A promise that will be resolved with the jobStatusId of the job.
      */
    inline def startJob(jobName: String, data: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("startJob")(jobName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    inline def useMasterKey(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useMasterKey")().asInstanceOf[Unit]
  }
  
  @JSImport("parse/react-native", "Config")
  @js.native
  open class Config ()
    extends typingsJapgolly.parse.mod.Config
  object Config {
    
    @JSImport("parse/react-native", "Config")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def current(): typingsJapgolly.parse.mod.global.Parse.Config = ^.asInstanceOf[js.Dynamic].applyDynamic("current")().asInstanceOf[typingsJapgolly.parse.mod.global.Parse.Config]
    
    /* static member */
    inline def get(): js.Promise[typingsJapgolly.parse.mod.global.Parse.Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[typingsJapgolly.parse.mod.global.Parse.Config]]
    inline def get(options: UseMasterKeyOption): js.Promise[typingsJapgolly.parse.mod.global.Parse.Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.parse.mod.global.Parse.Config]]
    
    /* static member */
    inline def save(attr: Any): js.Promise[typingsJapgolly.parse.mod.global.Parse.Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("save")(attr.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.parse.mod.global.Parse.Config]]
    inline def save(attr: Any, options: StringDictionary[Boolean]): js.Promise[typingsJapgolly.parse.mod.global.Parse.Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(attr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.parse.mod.global.Parse.Config]]
  }
  
  /**
    * Use this to set custom headers
    * The headers will be sent with every parse request
    */
  object CoreManager {
    
    @JSImport("parse/react-native", "CoreManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def set(key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("parse/react-native", "Error")
  @js.native
  open class Error protected ()
    extends typingsJapgolly.parse.mod.Error {
    def this(code: ErrorCode, message: String) = this()
  }
  object Error {
    
    @JSImport("parse/react-native", "Error")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("parse/react-native", "Error.ACCOUNT_ALREADY_LINKED")
    @js.native
    def ACCOUNT_ALREADY_LINKED: typingsJapgolly.parse.mod.ErrorCode.ACCOUNT_ALREADY_LINKED = js.native
    inline def ACCOUNT_ALREADY_LINKED_=(x: ACCOUNT_ALREADY_LINKED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCOUNT_ALREADY_LINKED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.AGGREGATE_ERROR")
    @js.native
    def AGGREGATE_ERROR: typingsJapgolly.parse.mod.ErrorCode.AGGREGATE_ERROR = js.native
    inline def AGGREGATE_ERROR_=(x: AGGREGATE_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AGGREGATE_ERROR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.CACHE_MISS")
    @js.native
    def CACHE_MISS: typingsJapgolly.parse.mod.ErrorCode.CACHE_MISS = js.native
    inline def CACHE_MISS_=(x: CACHE_MISS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CACHE_MISS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.COMMAND_UNAVAILABLE")
    @js.native
    def COMMAND_UNAVAILABLE: typingsJapgolly.parse.mod.ErrorCode.COMMAND_UNAVAILABLE = js.native
    inline def COMMAND_UNAVAILABLE_=(x: COMMAND_UNAVAILABLE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMMAND_UNAVAILABLE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.CONNECTION_FAILED")
    @js.native
    def CONNECTION_FAILED: typingsJapgolly.parse.mod.ErrorCode.CONNECTION_FAILED = js.native
    inline def CONNECTION_FAILED_=(x: CONNECTION_FAILED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_FAILED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.DUPLICATE_VALUE")
    @js.native
    def DUPLICATE_VALUE: typingsJapgolly.parse.mod.ErrorCode.DUPLICATE_VALUE = js.native
    inline def DUPLICATE_VALUE_=(x: DUPLICATE_VALUE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DUPLICATE_VALUE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.EMAIL_MISSING")
    @js.native
    def EMAIL_MISSING: typingsJapgolly.parse.mod.ErrorCode.EMAIL_MISSING = js.native
    inline def EMAIL_MISSING_=(x: EMAIL_MISSING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMAIL_MISSING")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.EMAIL_NOT_FOUND")
    @js.native
    def EMAIL_NOT_FOUND: typingsJapgolly.parse.mod.ErrorCode.EMAIL_NOT_FOUND = js.native
    inline def EMAIL_NOT_FOUND_=(x: EMAIL_NOT_FOUND): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMAIL_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.EMAIL_TAKEN")
    @js.native
    def EMAIL_TAKEN: typingsJapgolly.parse.mod.ErrorCode.EMAIL_TAKEN = js.native
    inline def EMAIL_TAKEN_=(x: EMAIL_TAKEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMAIL_TAKEN")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.EXCEEDED_QUOTA")
    @js.native
    def EXCEEDED_QUOTA: typingsJapgolly.parse.mod.ErrorCode.EXCEEDED_QUOTA = js.native
    inline def EXCEEDED_QUOTA_=(x: EXCEEDED_QUOTA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXCEEDED_QUOTA")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.FILE_DELETE_ERROR")
    @js.native
    def FILE_DELETE_ERROR: typingsJapgolly.parse.mod.ErrorCode.FILE_DELETE_ERROR = js.native
    inline def FILE_DELETE_ERROR_=(x: FILE_DELETE_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_DELETE_ERROR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.FILE_READ_ERROR")
    @js.native
    def FILE_READ_ERROR: typingsJapgolly.parse.mod.ErrorCode.FILE_READ_ERROR = js.native
    inline def FILE_READ_ERROR_=(x: FILE_READ_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_READ_ERROR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.FILE_SAVE_ERROR")
    @js.native
    def FILE_SAVE_ERROR: typingsJapgolly.parse.mod.ErrorCode.FILE_SAVE_ERROR = js.native
    inline def FILE_SAVE_ERROR_=(x: FILE_SAVE_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_SAVE_ERROR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.FILE_TOO_LARGE")
    @js.native
    def FILE_TOO_LARGE: typingsJapgolly.parse.mod.ErrorCode.FILE_TOO_LARGE = js.native
    inline def FILE_TOO_LARGE_=(x: FILE_TOO_LARGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_TOO_LARGE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INCORRECT_TYPE")
    @js.native
    def INCORRECT_TYPE: typingsJapgolly.parse.mod.ErrorCode.INCORRECT_TYPE = js.native
    inline def INCORRECT_TYPE_=(x: INCORRECT_TYPE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INCORRECT_TYPE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INTERNAL_SERVER_ERROR")
    @js.native
    def INTERNAL_SERVER_ERROR: typingsJapgolly.parse.mod.ErrorCode.INTERNAL_SERVER_ERROR = js.native
    inline def INTERNAL_SERVER_ERROR_=(x: INTERNAL_SERVER_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERNAL_SERVER_ERROR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_ACL")
    @js.native
    def INVALID_ACL: typingsJapgolly.parse.mod.ErrorCode.INVALID_ACL = js.native
    inline def INVALID_ACL_=(x: INVALID_ACL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ACL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_CHANNEL_NAME")
    @js.native
    def INVALID_CHANNEL_NAME: typingsJapgolly.parse.mod.ErrorCode.INVALID_CHANNEL_NAME = js.native
    inline def INVALID_CHANNEL_NAME_=(x: INVALID_CHANNEL_NAME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CHANNEL_NAME")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_CLASS_NAME")
    @js.native
    def INVALID_CLASS_NAME: typingsJapgolly.parse.mod.ErrorCode.INVALID_CLASS_NAME = js.native
    inline def INVALID_CLASS_NAME_=(x: INVALID_CLASS_NAME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CLASS_NAME")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_CONTENT_LENGTH")
    @js.native
    def INVALID_CONTENT_LENGTH: typingsJapgolly.parse.mod.ErrorCode.INVALID_CONTENT_LENGTH = js.native
    inline def INVALID_CONTENT_LENGTH_=(x: INVALID_CONTENT_LENGTH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CONTENT_LENGTH")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_EMAIL_ADDRESS")
    @js.native
    def INVALID_EMAIL_ADDRESS: typingsJapgolly.parse.mod.ErrorCode.INVALID_EMAIL_ADDRESS = js.native
    inline def INVALID_EMAIL_ADDRESS_=(x: INVALID_EMAIL_ADDRESS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_EMAIL_ADDRESS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_EVENT_NAME")
    @js.native
    def INVALID_EVENT_NAME: typingsJapgolly.parse.mod.ErrorCode.INVALID_EVENT_NAME = js.native
    inline def INVALID_EVENT_NAME_=(x: INVALID_EVENT_NAME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_FILE_NAME")
    @js.native
    def INVALID_FILE_NAME: typingsJapgolly.parse.mod.ErrorCode.INVALID_FILE_NAME = js.native
    inline def INVALID_FILE_NAME_=(x: INVALID_FILE_NAME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_FILE_NAME")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_IMAGE_DATA")
    @js.native
    def INVALID_IMAGE_DATA: typingsJapgolly.parse.mod.ErrorCode.INVALID_IMAGE_DATA = js.native
    inline def INVALID_IMAGE_DATA_=(x: INVALID_IMAGE_DATA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_IMAGE_DATA")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_JSON")
    @js.native
    def INVALID_JSON: typingsJapgolly.parse.mod.ErrorCode.INVALID_JSON = js.native
    inline def INVALID_JSON_=(x: INVALID_JSON): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_JSON")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_KEY_NAME")
    @js.native
    def INVALID_KEY_NAME: typingsJapgolly.parse.mod.ErrorCode.INVALID_KEY_NAME = js.native
    inline def INVALID_KEY_NAME_=(x: INVALID_KEY_NAME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_KEY_NAME")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_LINKED_SESSION")
    @js.native
    def INVALID_LINKED_SESSION: typingsJapgolly.parse.mod.ErrorCode.INVALID_LINKED_SESSION = js.native
    inline def INVALID_LINKED_SESSION_=(x: INVALID_LINKED_SESSION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_LINKED_SESSION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_NESTED_KEY")
    @js.native
    def INVALID_NESTED_KEY: typingsJapgolly.parse.mod.ErrorCode.INVALID_NESTED_KEY = js.native
    inline def INVALID_NESTED_KEY_=(x: INVALID_NESTED_KEY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_NESTED_KEY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_POINTER")
    @js.native
    def INVALID_POINTER: typingsJapgolly.parse.mod.ErrorCode.INVALID_POINTER = js.native
    inline def INVALID_POINTER_=(x: INVALID_POINTER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_POINTER")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_PUSH_TIME_ERROR")
    @js.native
    def INVALID_PUSH_TIME_ERROR: typingsJapgolly.parse.mod.ErrorCode.INVALID_PUSH_TIME_ERROR = js.native
    inline def INVALID_PUSH_TIME_ERROR_=(x: INVALID_PUSH_TIME_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_PUSH_TIME_ERROR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_QUERY")
    @js.native
    def INVALID_QUERY: typingsJapgolly.parse.mod.ErrorCode.INVALID_QUERY = js.native
    inline def INVALID_QUERY_=(x: INVALID_QUERY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_QUERY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_ROLE_NAME")
    @js.native
    def INVALID_ROLE_NAME: typingsJapgolly.parse.mod.ErrorCode.INVALID_ROLE_NAME = js.native
    inline def INVALID_ROLE_NAME_=(x: INVALID_ROLE_NAME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ROLE_NAME")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_SESSION_TOKEN")
    @js.native
    def INVALID_SESSION_TOKEN: typingsJapgolly.parse.mod.ErrorCode.INVALID_SESSION_TOKEN = js.native
    inline def INVALID_SESSION_TOKEN_=(x: INVALID_SESSION_TOKEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_SESSION_TOKEN")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.LINKED_ID_MISSING")
    @js.native
    def LINKED_ID_MISSING: typingsJapgolly.parse.mod.ErrorCode.LINKED_ID_MISSING = js.native
    inline def LINKED_ID_MISSING_=(x: LINKED_ID_MISSING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINKED_ID_MISSING")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.MISSING_CONTENT_LENGTH")
    @js.native
    def MISSING_CONTENT_LENGTH: typingsJapgolly.parse.mod.ErrorCode.MISSING_CONTENT_LENGTH = js.native
    inline def MISSING_CONTENT_LENGTH_=(x: MISSING_CONTENT_LENGTH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MISSING_CONTENT_LENGTH")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.MISSING_CONTENT_TYPE")
    @js.native
    def MISSING_CONTENT_TYPE: typingsJapgolly.parse.mod.ErrorCode.MISSING_CONTENT_TYPE = js.native
    inline def MISSING_CONTENT_TYPE_=(x: MISSING_CONTENT_TYPE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MISSING_CONTENT_TYPE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.MISSING_OBJECT_ID")
    @js.native
    def MISSING_OBJECT_ID: typingsJapgolly.parse.mod.ErrorCode.MISSING_OBJECT_ID = js.native
    inline def MISSING_OBJECT_ID_=(x: MISSING_OBJECT_ID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MISSING_OBJECT_ID")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.MUST_CREATE_USER_THROUGH_SIGNUP")
    @js.native
    def MUST_CREATE_USER_THROUGH_SIGNUP: typingsJapgolly.parse.mod.ErrorCode.MUST_CREATE_USER_THROUGH_SIGNUP = js.native
    inline def MUST_CREATE_USER_THROUGH_SIGNUP_=(x: MUST_CREATE_USER_THROUGH_SIGNUP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MUST_CREATE_USER_THROUGH_SIGNUP")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.NOT_INITIALIZED")
    @js.native
    def NOT_INITIALIZED: typingsJapgolly.parse.mod.ErrorCode.NOT_INITIALIZED = js.native
    inline def NOT_INITIALIZED_=(x: NOT_INITIALIZED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_INITIALIZED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.OBJECT_NOT_FOUND")
    @js.native
    def OBJECT_NOT_FOUND: typingsJapgolly.parse.mod.ErrorCode.OBJECT_NOT_FOUND = js.native
    inline def OBJECT_NOT_FOUND_=(x: OBJECT_NOT_FOUND): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.OBJECT_TOO_LARGE")
    @js.native
    def OBJECT_TOO_LARGE: typingsJapgolly.parse.mod.ErrorCode.OBJECT_TOO_LARGE = js.native
    inline def OBJECT_TOO_LARGE_=(x: OBJECT_TOO_LARGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_TOO_LARGE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.OPERATION_FORBIDDEN")
    @js.native
    def OPERATION_FORBIDDEN: typingsJapgolly.parse.mod.ErrorCode.OPERATION_FORBIDDEN = js.native
    inline def OPERATION_FORBIDDEN_=(x: OPERATION_FORBIDDEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPERATION_FORBIDDEN")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.OTHER_CAUSE")
    @js.native
    def OTHER_CAUSE: typingsJapgolly.parse.mod.ErrorCode.OTHER_CAUSE = js.native
    inline def OTHER_CAUSE_=(x: OTHER_CAUSE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OTHER_CAUSE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.PASSWORD_MISSING")
    @js.native
    def PASSWORD_MISSING: typingsJapgolly.parse.mod.ErrorCode.PASSWORD_MISSING = js.native
    inline def PASSWORD_MISSING_=(x: PASSWORD_MISSING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PASSWORD_MISSING")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.PUSH_MISCONFIGURED")
    @js.native
    def PUSH_MISCONFIGURED: typingsJapgolly.parse.mod.ErrorCode.PUSH_MISCONFIGURED = js.native
    inline def PUSH_MISCONFIGURED_=(x: PUSH_MISCONFIGURED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUSH_MISCONFIGURED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.REQUEST_LIMIT_EXCEEDED")
    @js.native
    def REQUEST_LIMIT_EXCEEDED: typingsJapgolly.parse.mod.ErrorCode.REQUEST_LIMIT_EXCEEDED = js.native
    inline def REQUEST_LIMIT_EXCEEDED_=(x: REQUEST_LIMIT_EXCEEDED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_LIMIT_EXCEEDED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.SCRIPT_FAILED")
    @js.native
    def SCRIPT_FAILED: typingsJapgolly.parse.mod.ErrorCode.SCRIPT_FAILED = js.native
    inline def SCRIPT_FAILED_=(x: SCRIPT_FAILED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCRIPT_FAILED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.SESSION_MISSING")
    @js.native
    def SESSION_MISSING: typingsJapgolly.parse.mod.ErrorCode.SESSION_MISSING = js.native
    inline def SESSION_MISSING_=(x: SESSION_MISSING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SESSION_MISSING")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.TIMEOUT")
    @js.native
    def TIMEOUT: typingsJapgolly.parse.mod.ErrorCode.TIMEOUT = js.native
    inline def TIMEOUT_=(x: TIMEOUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.UNSAVED_FILE_ERROR")
    @js.native
    def UNSAVED_FILE_ERROR: typingsJapgolly.parse.mod.ErrorCode.UNSAVED_FILE_ERROR = js.native
    inline def UNSAVED_FILE_ERROR_=(x: UNSAVED_FILE_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSAVED_FILE_ERROR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.UNSUPPORTED_SERVICE")
    @js.native
    def UNSUPPORTED_SERVICE: typingsJapgolly.parse.mod.ErrorCode.UNSUPPORTED_SERVICE = js.native
    inline def UNSUPPORTED_SERVICE_=(x: UNSUPPORTED_SERVICE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSUPPORTED_SERVICE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.USERNAME_MISSING")
    @js.native
    def USERNAME_MISSING: typingsJapgolly.parse.mod.ErrorCode.USERNAME_MISSING = js.native
    inline def USERNAME_MISSING_=(x: USERNAME_MISSING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USERNAME_MISSING")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.USERNAME_TAKEN")
    @js.native
    def USERNAME_TAKEN: typingsJapgolly.parse.mod.ErrorCode.USERNAME_TAKEN = js.native
    inline def USERNAME_TAKEN_=(x: USERNAME_TAKEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USERNAME_TAKEN")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.VALIDATION_ERROR")
    @js.native
    def VALIDATION_ERROR: typingsJapgolly.parse.mod.ErrorCode.VALIDATION_ERROR = js.native
    inline def VALIDATION_ERROR_=(x: VALIDATION_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALIDATION_ERROR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.X_DOMAIN_REQUEST")
    @js.native
    def X_DOMAIN_REQUEST: typingsJapgolly.parse.mod.ErrorCode.X_DOMAIN_REQUEST = js.native
    inline def X_DOMAIN_REQUEST_=(x: X_DOMAIN_REQUEST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X_DOMAIN_REQUEST")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("parse/react-native", "ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.parse.mod.ErrorCode & Double] = js.native
    
    /* 208 */ val ACCOUNT_ALREADY_LINKED: typingsJapgolly.parse.mod.ErrorCode.ACCOUNT_ALREADY_LINKED & Double = js.native
    
    /* 600 */ val AGGREGATE_ERROR: typingsJapgolly.parse.mod.ErrorCode.AGGREGATE_ERROR & Double = js.native
    
    /* 120 */ val CACHE_MISS: typingsJapgolly.parse.mod.ErrorCode.CACHE_MISS & Double = js.native
    
    /* 108 */ val COMMAND_UNAVAILABLE: typingsJapgolly.parse.mod.ErrorCode.COMMAND_UNAVAILABLE & Double = js.native
    
    /* 100 */ val CONNECTION_FAILED: typingsJapgolly.parse.mod.ErrorCode.CONNECTION_FAILED & Double = js.native
    
    /* 137 */ val DUPLICATE_VALUE: typingsJapgolly.parse.mod.ErrorCode.DUPLICATE_VALUE & Double = js.native
    
    /* 204 */ val EMAIL_MISSING: typingsJapgolly.parse.mod.ErrorCode.EMAIL_MISSING & Double = js.native
    
    /* 205 */ val EMAIL_NOT_FOUND: typingsJapgolly.parse.mod.ErrorCode.EMAIL_NOT_FOUND & Double = js.native
    
    /* 203 */ val EMAIL_TAKEN: typingsJapgolly.parse.mod.ErrorCode.EMAIL_TAKEN & Double = js.native
    
    /* 140 */ val EXCEEDED_QUOTA: typingsJapgolly.parse.mod.ErrorCode.EXCEEDED_QUOTA & Double = js.native
    
    /* 153 */ val FILE_DELETE_ERROR: typingsJapgolly.parse.mod.ErrorCode.FILE_DELETE_ERROR & Double = js.native
    
    /* 601 */ val FILE_READ_ERROR: typingsJapgolly.parse.mod.ErrorCode.FILE_READ_ERROR & Double = js.native
    
    /* 130 */ val FILE_SAVE_ERROR: typingsJapgolly.parse.mod.ErrorCode.FILE_SAVE_ERROR & Double = js.native
    
    /* 129 */ val FILE_TOO_LARGE: typingsJapgolly.parse.mod.ErrorCode.FILE_TOO_LARGE & Double = js.native
    
    /* 111 */ val INCORRECT_TYPE: typingsJapgolly.parse.mod.ErrorCode.INCORRECT_TYPE & Double = js.native
    
    /* 1 */ val INTERNAL_SERVER_ERROR: typingsJapgolly.parse.mod.ErrorCode.INTERNAL_SERVER_ERROR & Double = js.native
    
    /* 123 */ val INVALID_ACL: typingsJapgolly.parse.mod.ErrorCode.INVALID_ACL & Double = js.native
    
    /* 112 */ val INVALID_CHANNEL_NAME: typingsJapgolly.parse.mod.ErrorCode.INVALID_CHANNEL_NAME & Double = js.native
    
    /* 103 */ val INVALID_CLASS_NAME: typingsJapgolly.parse.mod.ErrorCode.INVALID_CLASS_NAME & Double = js.native
    
    /* 128 */ val INVALID_CONTENT_LENGTH: typingsJapgolly.parse.mod.ErrorCode.INVALID_CONTENT_LENGTH & Double = js.native
    
    /* 125 */ val INVALID_EMAIL_ADDRESS: typingsJapgolly.parse.mod.ErrorCode.INVALID_EMAIL_ADDRESS & Double = js.native
    
    /* 160 */ val INVALID_EVENT_NAME: typingsJapgolly.parse.mod.ErrorCode.INVALID_EVENT_NAME & Double = js.native
    
    /* 122 */ val INVALID_FILE_NAME: typingsJapgolly.parse.mod.ErrorCode.INVALID_FILE_NAME & Double = js.native
    
    /* 150 */ val INVALID_IMAGE_DATA: typingsJapgolly.parse.mod.ErrorCode.INVALID_IMAGE_DATA & Double = js.native
    
    /* 107 */ val INVALID_JSON: typingsJapgolly.parse.mod.ErrorCode.INVALID_JSON & Double = js.native
    
    /* 105 */ val INVALID_KEY_NAME: typingsJapgolly.parse.mod.ErrorCode.INVALID_KEY_NAME & Double = js.native
    
    /* 251 */ val INVALID_LINKED_SESSION: typingsJapgolly.parse.mod.ErrorCode.INVALID_LINKED_SESSION & Double = js.native
    
    /* 121 */ val INVALID_NESTED_KEY: typingsJapgolly.parse.mod.ErrorCode.INVALID_NESTED_KEY & Double = js.native
    
    /* 106 */ val INVALID_POINTER: typingsJapgolly.parse.mod.ErrorCode.INVALID_POINTER & Double = js.native
    
    /* 152 */ val INVALID_PUSH_TIME_ERROR: typingsJapgolly.parse.mod.ErrorCode.INVALID_PUSH_TIME_ERROR & Double = js.native
    
    /* 102 */ val INVALID_QUERY: typingsJapgolly.parse.mod.ErrorCode.INVALID_QUERY & Double = js.native
    
    /* 139 */ val INVALID_ROLE_NAME: typingsJapgolly.parse.mod.ErrorCode.INVALID_ROLE_NAME & Double = js.native
    
    /* 209 */ val INVALID_SESSION_TOKEN: typingsJapgolly.parse.mod.ErrorCode.INVALID_SESSION_TOKEN & Double = js.native
    
    /* 250 */ val LINKED_ID_MISSING: typingsJapgolly.parse.mod.ErrorCode.LINKED_ID_MISSING & Double = js.native
    
    /* 127 */ val MISSING_CONTENT_LENGTH: typingsJapgolly.parse.mod.ErrorCode.MISSING_CONTENT_LENGTH & Double = js.native
    
    /* 126 */ val MISSING_CONTENT_TYPE: typingsJapgolly.parse.mod.ErrorCode.MISSING_CONTENT_TYPE & Double = js.native
    
    /* 104 */ val MISSING_OBJECT_ID: typingsJapgolly.parse.mod.ErrorCode.MISSING_OBJECT_ID & Double = js.native
    
    /* 207 */ val MUST_CREATE_USER_THROUGH_SIGNUP: typingsJapgolly.parse.mod.ErrorCode.MUST_CREATE_USER_THROUGH_SIGNUP & Double = js.native
    
    /* 109 */ val NOT_INITIALIZED: typingsJapgolly.parse.mod.ErrorCode.NOT_INITIALIZED & Double = js.native
    
    /* 101 */ val OBJECT_NOT_FOUND: typingsJapgolly.parse.mod.ErrorCode.OBJECT_NOT_FOUND & Double = js.native
    
    /* 116 */ val OBJECT_TOO_LARGE: typingsJapgolly.parse.mod.ErrorCode.OBJECT_TOO_LARGE & Double = js.native
    
    /* 119 */ val OPERATION_FORBIDDEN: typingsJapgolly.parse.mod.ErrorCode.OPERATION_FORBIDDEN & Double = js.native
    
    /* -1 */ val OTHER_CAUSE: typingsJapgolly.parse.mod.ErrorCode.OTHER_CAUSE & Double = js.native
    
    /* 201 */ val PASSWORD_MISSING: typingsJapgolly.parse.mod.ErrorCode.PASSWORD_MISSING & Double = js.native
    
    /* 115 */ val PUSH_MISCONFIGURED: typingsJapgolly.parse.mod.ErrorCode.PUSH_MISCONFIGURED & Double = js.native
    
    /* 155 */ val REQUEST_LIMIT_EXCEEDED: typingsJapgolly.parse.mod.ErrorCode.REQUEST_LIMIT_EXCEEDED & Double = js.native
    
    /* 141 */ val SCRIPT_FAILED: typingsJapgolly.parse.mod.ErrorCode.SCRIPT_FAILED & Double = js.native
    
    /* 206 */ val SESSION_MISSING: typingsJapgolly.parse.mod.ErrorCode.SESSION_MISSING & Double = js.native
    
    /* 124 */ val TIMEOUT: typingsJapgolly.parse.mod.ErrorCode.TIMEOUT & Double = js.native
    
    /* 151 */ val UNSAVED_FILE_ERROR: typingsJapgolly.parse.mod.ErrorCode.UNSAVED_FILE_ERROR & Double = js.native
    
    /* 252 */ val UNSUPPORTED_SERVICE: typingsJapgolly.parse.mod.ErrorCode.UNSUPPORTED_SERVICE & Double = js.native
    
    /* 200 */ val USERNAME_MISSING: typingsJapgolly.parse.mod.ErrorCode.USERNAME_MISSING & Double = js.native
    
    /* 202 */ val USERNAME_TAKEN: typingsJapgolly.parse.mod.ErrorCode.USERNAME_TAKEN & Double = js.native
    
    /* 142 */ val VALIDATION_ERROR: typingsJapgolly.parse.mod.ErrorCode.VALIDATION_ERROR & Double = js.native
    
    /* 602 */ val X_DOMAIN_REQUEST: typingsJapgolly.parse.mod.ErrorCode.X_DOMAIN_REQUEST & Double = js.native
  }
  
  /**
    * Provides a set of utilities for using Parse with Facebook.
    * Provides a set of utilities for using Parse with Facebook.
    */
  object FacebookUtils {
    
    @JSImport("parse/react-native", "FacebookUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    inline def init(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def isLinked(user: typingsJapgolly.parse.mod.global.Parse.User[Attributes]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLinked")(user.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def link(user: typingsJapgolly.parse.mod.global.Parse.User[Attributes], permissions: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(user.asInstanceOf[js.Any], permissions.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def link(
      user: typingsJapgolly.parse.mod.global.Parse.User[Attributes],
      permissions: Any,
      options: SuccessFailureOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(user.asInstanceOf[js.Any], permissions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logIn(permissions: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logIn")(permissions.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def logIn(permissions: Any, options: FullOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logIn")(permissions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def unlink(user: typingsJapgolly.parse.mod.global.Parse.User[Attributes]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(user.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def unlink(user: typingsJapgolly.parse.mod.global.Parse.User[Attributes], options: SuccessFailureOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(user.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /**
    * A Parse.File is a local representation of a file that is saved to the Parse
    * cloud.
    * @param name The file's name. This will be prefixed by a unique
    *     value once the file has finished saving. The file name must begin with
    *     an alphanumeric character, and consist of alphanumeric characters,
    *     periods, spaces, underscores, or dashes.
    * @param data The data for the file, as either:
    *     1. an Array of byte value Numbers, or
    *     2. an Object like { base64: "..." } with a base64-encoded String.
    *     3. a File object selected with a file upload control. (3) only works
    *        in Firefox 3.6+, Safari 6.0.2+, Chrome 7+, and IE 10+.
    *        For example:<pre>
    * var fileUploadControl = $("#profilePhotoFileUpload")[0];
    * if (fileUploadControl.files.length > 0) {
    *   var file = fileUploadControl.files[0];
    *   var name = "photo.jpg";
    *   var parseFile = new Parse.File(name, file);
    *   parseFile.save().then(function() {
    *     // The file has been saved to Parse.
    *   }, function(error) {
    *     // The file either could not be read, or could not be saved to Parse.
    *   });
    * }</pre>
    * @param type Optional Content-Type header to use for the file. If
    *     this is omitted, the content type will be inferred from the name's
    *     extension.
    */
  @JSImport("parse/react-native", "File")
  @js.native
  open class File protected ()
    extends typingsJapgolly.parse.mod.File {
    def this(name: String, data: js.Array[Double]) = this()
    def this(name: String, data: Base64) = this()
    def this(name: String, data: Size) = this()
    def this(name: String, data: Uri) = this()
    def this(name: String, data: js.Array[Double], `type`: String) = this()
    def this(name: String, data: Base64, `type`: String) = this()
    def this(name: String, data: Size, `type`: String) = this()
    def this(name: String, data: Uri, `type`: String) = this()
  }
  
  /**
    * Creates a new GeoPoint with any of the following forms:<br>
    *   <pre>
    *   new GeoPoint(otherGeoPoint)
    *   new GeoPoint(30, 30)
    *   new GeoPoint([30, 30])
    *   new GeoPoint({latitude: 30, longitude: 30})
    *   new GeoPoint()  // defaults to (0, 0)
    *   </pre>
    *
    * <p>Represents a latitude / longitude point that may be associated
    * with a key in a ParseObject or used as a reference point for geo queries.
    * This allows proximity-based queries on the key.</p>
    *
    * <p>Only one key in a class may contain a GeoPoint.</p>
    *
    * <p>Example:<pre>
    *   var point = new Parse.GeoPoint(30.0, -20.0);
    *   var object = new Parse.Object("PlaceObject");
    *   object.set("location", point);
    *   object.save();</pre></p>
    */
  @JSImport("parse/react-native", "GeoPoint")
  @js.native
  open class GeoPoint ()
    extends typingsJapgolly.parse.mod.GeoPoint {
    def this(coords: js.Tuple2[Double, Double]) = this()
    def this(coords: Latitude) = this()
    def this(latitude: Double, longitude: Double) = this()
  }
  
  @JSImport("parse/react-native", "Installation")
  @js.native
  val Installation: InstallationConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("parse/react-native", "Installation")
  @js.native
  open class InstallationCls[T /* <: Attributes */] protected ()
    extends StObject
       with typingsJapgolly.parse.mod.global.Parse.Installation[T] {
    def this(attributes: T) = this()
  }
  
  /**
    * Represents a LiveQuery Subscription.
    *
    * @see https://docs.parseplatform.org/js/guide/#live-queries
    * @see NodeJS.EventEmitter
    *
    * Events list
    * ---
    * `open` - when you call `query.subscribe()`, we send a subscribe request to
    * the LiveQuery server, when we get the confirmation from the LiveQuery server,
    * this event will be emitted. When the client loses WebSocket connection to the
    * LiveQuery server, we will try to auto reconnect the LiveQuery server. If we
    * reconnect the LiveQuery server and successfully resubscribe the ParseQuery,
    * you'll also get this event.
    *
    * ```
    * subscription.on('open', () => {});
    * ```
    * ---
    * `create` - when a new ParseObject is created and it fulfills the ParseQuery you subscribe,
    * you'll get this event. The object is the ParseObject which is created.
    *
    * ```
    * subscription.on('create', (object: Parse.Object) => {});
    * ```
    * ---
    * `update` event - when an existing ParseObject which fulfills the ParseQuery you subscribe
    * is updated (The ParseObject fulfills the ParseQuery before and after changes),
    * you'll get this event. The object is the ParseObject which is updated.
    * Its content is the latest value of the ParseObject.
    *
    * ```
    * subscription.on('update', (object: Parse.Object) => {});
    * ```
    * ---
    * `enter` event - when an existing ParseObject's old value doesn't fulfill the ParseQuery
    * but its new value fulfills the ParseQuery, you'll get this event. The object is the
    * ParseObject which enters the ParseQuery. Its content is the latest value of the ParseObject.
    *
    * ```
    * subscription.on('enter', (object: Parse.Object) => {});
    * ```
    * ---
    * `update` event - when an existing ParseObject's old value fulfills the ParseQuery but its new value
    * doesn't fulfill the ParseQuery, you'll get this event. The object is the ParseObject
    * which leaves the ParseQuery. Its content is the latest value of the ParseObject.
    *
    * ```
    * subscription.on('leave', (object: Parse.Object) => {});
    * ```
    * ---
    * `delete` event - when an existing ParseObject which fulfills the ParseQuery is deleted, you'll
    * get this event. The object is the ParseObject which is deleted.
    *
    * ```
    * subscription.on('delete', (object: Parse.Object) => {});
    * ```
    * ---
    * `close` event - when the client loses the WebSocket connection to the LiveQuery
    * server and we stop receiving events, you'll get this event.
    *
    * ```
    * subscription.on('close', () => {});
    * ```
    */
  @JSImport("parse/react-native", "LiveQuerySubscription")
  @js.native
  open class LiveQuerySubscription protected ()
    extends typingsJapgolly.parse.mod.LiveQuerySubscription {
    /**
      * Creates an instance of LiveQuerySubscription.
      *
      * @param id
      * @param query
      * @param [sessionToken]
      */
    def this(id: String, query: String) = this()
    def this(id: String, query: String, sessionToken: String) = this()
  }
  
  object Object extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("parse/react-native", "Object")
    @js.native
    open class ^[T /* <: Attributes */] protected ()
      extends StObject
         with typingsJapgolly.parse.mod.global.Parse.Object[T] {
      def this(className: String, attributes: T) = this()
      def this(className: String, attributes: T, options: Any) = this()
    }
    
    @JSImport("parse/react-native", "Object")
    @js.native
    val ^ : js.Object & ObjectConstructor = js.native
    
    type _To = js.Object & ObjectConstructor
    
    /* This means you don't have to write `^`, but can instead just say `Object.foo` */
    override def _to: js.Object & ObjectConstructor = ^
  }
  
  @JSImport("parse/react-native", "Polygon")
  @js.native
  open class Polygon protected ()
    extends typingsJapgolly.parse.mod.Polygon {
    def this(arg1: js.Array[js.Array[Double] | typingsJapgolly.parse.mod.global.Parse.GeoPoint]) = this()
  }
  
  /**
    * Contains functions to deal with Push in Parse
    */
  object Push {
    
    @JSImport("parse/react-native", "Push")
    @js.native
    val ^ : js.Any = js.native
    
    inline def send[T](data: PushData): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
    inline def send[T](data: PushData, options: SendOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  }
  
  /**
    * Creates a new parse Parse.Query for the given Parse.Object subclass.
    * @param objectClass -
    *   An instance of a subclass of Parse.Object, or a Parse className string.
    *
    * <p>Parse.Query defines a query that is used to fetch Parse.Objects. The
    * most common use case is finding all objects that match a query through the
    * <code>find</code> method. For example, this sample code fetches all objects
    * of class <code>MyClass</code>. It calls a different function depending on
    * whether the fetch succeeded or not.
    *
    * <pre>
    * var query = new Parse.Query(MyClass);
    * query.find({
    *   success: function(results) {
    *     // results is an array of Parse.Object.
    *   },
    *
    *   error: function(error) {
    *     // error is an instance of Parse.Error.
    *   }
    * });</pre></p>
    *
    * <p>A Parse.Query can also be used to retrieve a single object whose id is
    * known, through the get method. For example, this sample code fetches an
    * object of class <code>MyClass</code> and id <code>myId</code>. It calls a
    * different function depending on whether the fetch succeeded or not.
    *
    * <pre>
    * var query = new Parse.Query(MyClass);
    * query.get(myId, {
    *   success: function(object) {
    *     // object is an instance of Parse.Object.
    *   },
    *
    *   error: function(object, error) {
    *     // error is an instance of Parse.Error.
    *   }
    * });</pre></p>
    *
    * <p>A Parse.Query can also be used to count the number of objects that match
    * the query without retrieving all of those objects. For example, this
    * sample code counts the number of objects of the class <code>MyClass</code>
    * <pre>
    * var query = new Parse.Query(MyClass);
    * query.count({
    *   success: function(number) {
    *     // There are number instances of MyClass.
    *   },
    *
    *   error: function(error) {
    *     // error is an instance of Parse.Error.
    *   }
    * });</pre></p>
    */
  @JSImport("parse/react-native", "Query")
  @js.native
  open class Query[T /* <: Object[Attributes] */] protected ()
    extends typingsJapgolly.parse.mod.Query[T] {
    def this(objectClass: String) = this()
    def this(objectClass: Instantiable1[/* args (repeated) */ Any, T | Object[Attributes]]) = this()
  }
  object Query {
    
    @JSImport("parse/react-native", "Query")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def and[U /* <: Object[Attributes] */](args: typingsJapgolly.parse.mod.global.Parse.Query[U]*): typingsJapgolly.parse.mod.global.Parse.Query[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.parse.mod.global.Parse.Query[U]]
    
    /* static member */
    inline def fromJSON[U /* <: Object[Attributes] */](className: String, json: Any): typingsJapgolly.parse.mod.global.Parse.Query[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(className.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.parse.mod.global.Parse.Query[U]]
    inline def fromJSON[U /* <: Object[Attributes] */](className: Instantiable0[U], json: Any): typingsJapgolly.parse.mod.global.Parse.Query[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(className.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.parse.mod.global.Parse.Query[U]]
    
    /* static member */
    inline def nor[U /* <: Object[Attributes] */](args: typingsJapgolly.parse.mod.global.Parse.Query[U]*): typingsJapgolly.parse.mod.global.Parse.Query[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("nor")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.parse.mod.global.Parse.Query[U]]
    
    /* static member */
    inline def or[U /* <: Object[Attributes] */](var_args: typingsJapgolly.parse.mod.global.Parse.Query[U]*): typingsJapgolly.parse.mod.global.Parse.Query[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(var_args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.parse.mod.global.Parse.Query[U]]
  }
  
  /**
    * A class that is used to access all of the children of a many-to-many relationship.
    * Each instance of Parse.Relation is associated with a particular parent object and key.
    */
  @JSImport("parse/react-native", "Relation")
  @js.native
  open class Relation[S /* <: Object[Attributes] */, T /* <: Object[Attributes] */] ()
    extends typingsJapgolly.parse.mod.Relation[S, T] {
    def this(parent: S) = this()
    def this(parent: S, key: String) = this()
    def this(parent: Unit, key: String) = this()
  }
  
  @JSImport("parse/react-native", "Role")
  @js.native
  val Role: RoleConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("parse/react-native", "Role")
  @js.native
  open class RoleCls[T /* <: Attributes */] protected ()
    extends StObject
       with typingsJapgolly.parse.mod.global.Parse.Role[Partial[T]] {
    def this(name: String, acl: typingsJapgolly.parse.mod.global.Parse.ACL) = this()
  }
  
  /**
    * A Parse.Schema object is for handling schema data from Parse.
    * All the schemas methods require MasterKey.
    *
    * @param className Parse Class string
    *
    * https://parseplatform.org/Parse-SDK-JS/api/master/Parse.Schema.html
    *
    * ```
    * const schema = new Parse.Schema('MyClass');
    * schema.addString('field');
    * schema.addIndex('index_name', { field: 1 });
    * schema.save();
    * ```
    */
  @JSImport("parse/react-native", "Schema")
  @js.native
  open class Schema[T /* <: Object[Attributes] */] protected ()
    extends typingsJapgolly.parse.mod.Schema[T] {
    def this(className: String) = this()
  }
  object Schema {
    
    @JSImport("parse/react-native", "Schema")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Static method to get all schemas
      *
      * @return A promise that is resolved with the result when
      * the query completes.
      */
    /* static member */
    inline def all(): js.Promise[js.Array[RestSchema]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[js.Promise[js.Array[RestSchema]]]
  }
  
  @JSImport("parse/react-native", "Session")
  @js.native
  val Session: SessionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("parse/react-native", "Session")
  @js.native
  open class SessionCls[T /* <: Attributes */] protected ()
    extends StObject
       with typingsJapgolly.parse.mod.global.Parse.Session[T] {
    def this(attributes: T) = this()
  }
  
  @JSImport("parse/react-native", "User")
  @js.native
  val User: UserConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("parse/react-native", "User")
  @js.native
  open class UserCls[T /* <: Attributes */] protected ()
    extends StObject
       with typingsJapgolly.parse.mod.global.Parse.User[T] {
    def this(attributes: T) = this()
  }
  
  @JSImport("parse/react-native", "applicationId")
  @js.native
  def applicationId: String = js.native
  inline def applicationId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(x.asInstanceOf[js.Any])
  
  /**
    * Gets all contents from Local Datastore.
    */
  inline def dumpLocalDatastore(): js.Promise[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dumpLocalDatastore")().asInstanceOf[js.Promise[StringDictionary[Any]]]
  
  /**
    * Enable the current user encryption.
    * This must be called before login any user.
    */
  inline def enableEncryptedUser(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableEncryptedUser")().asInstanceOf[Unit]
  
  /**
    * Enable pinning in your application.
    * This must be called before your application can use pinning.
    */
  inline def enableLocalDatastore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLocalDatastore")().asInstanceOf[Unit]
  
  @JSImport("parse/react-native", "encryptedUser")
  @js.native
  def encryptedUser: Boolean = js.native
  inline def encryptedUser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encryptedUser")(x.asInstanceOf[js.Any])
  
  @JSImport("parse/react-native", "idempotency")
  @js.native
  def idempotency: Boolean = js.native
  inline def idempotency_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idempotency")(x.asInstanceOf[js.Any])
  
  /**
    * Call this method first to set up your authentication tokens for Parse.
    * You can get your keys from the Data Browser on parse.com.
    * @param applicationId Your Parse Application ID.
    * @param javaScriptKey (optional) Your Parse JavaScript Key (Not needed for parse-server)
    * @param masterKey (optional) Your Parse Master Key. (Node.js only!)
    */
  inline def initialize(applicationId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def initialize(applicationId: String, javaScriptKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any], javaScriptKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initialize(applicationId: String, javaScriptKey: String, masterKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any], javaScriptKey.asInstanceOf[js.Any], masterKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initialize(applicationId: String, javaScriptKey: Unit, masterKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any], javaScriptKey.asInstanceOf[js.Any], masterKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Flag that indicates whether Encrypted User is enabled.
    */
  inline def isEncryptedUserEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEncryptedUserEnabled")().asInstanceOf[Boolean]
  
  /**
    * Flag that indicates whether Local Datastore is enabled.
    */
  inline def isLocalDatastoreEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocalDatastoreEnabled")().asInstanceOf[Boolean]
  
  @JSImport("parse/react-native", "javaScriptKey")
  @js.native
  def javaScriptKey: js.UndefOr[String] = js.native
  inline def javaScriptKey_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("javaScriptKey")(x.asInstanceOf[js.Any])
  
  @JSImport("parse/react-native", "liveQueryServerURL")
  @js.native
  def liveQueryServerURL: String = js.native
  inline def liveQueryServerURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("liveQueryServerURL")(x.asInstanceOf[js.Any])
  
  @JSImport("parse/react-native", "masterKey")
  @js.native
  def masterKey: js.UndefOr[String] = js.native
  inline def masterKey_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("masterKey")(x.asInstanceOf[js.Any])
  
  @JSImport("parse/react-native", "secret")
  @js.native
  def secret: String = js.native
  inline def secret_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secret")(x.asInstanceOf[js.Any])
  
  @JSImport("parse/react-native", "serverAuthToken")
  @js.native
  def serverAuthToken: js.UndefOr[String] = js.native
  inline def serverAuthToken_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverAuthToken")(x.asInstanceOf[js.Any])
  
  @JSImport("parse/react-native", "serverAuthType")
  @js.native
  def serverAuthType: js.UndefOr[String] = js.native
  inline def serverAuthType_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverAuthType")(x.asInstanceOf[js.Any])
  
  @JSImport("parse/react-native", "serverURL")
  @js.native
  def serverURL: String = js.native
  inline def serverURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverURL")(x.asInstanceOf[js.Any])
  
  /**
    * Additionally on React-Native / Expo environments, add AsyncStorage from 'react-native' package
    * @param AsyncStorage AsyncStorage from 'react-native' package
    */
  inline def setAsyncStorage(AsyncStorage: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAsyncStorage")(AsyncStorage.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLocalDatastoreController(controller: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocalDatastoreController")(controller.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
