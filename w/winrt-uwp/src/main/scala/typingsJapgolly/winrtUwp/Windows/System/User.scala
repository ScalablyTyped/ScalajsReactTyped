package typingsJapgolly.winrtUwp.Windows.System

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a user. */
@JSGlobal("Windows.System.User")
@js.native
abstract class User () extends js.Object {
  /** Gets the authentication status of the user. */
  var authenticationStatus: UserAuthenticationStatus = js.native
  /** Gets the user's non-roamable id. */
  var nonRoamableId: String = js.native
  /** Gets the user type. */
  var `type`: UserType = js.native
  /**
    * Gets a user's picture asynchronously.
    * @param desiredSize The desired size of the user's picture to return.
    * @return When this method completes, it returns the user's picture.
    */
  def getPictureAsync(desiredSize: UserPictureSize): IPromiseWithIAsyncOperation[IRandomAccessStreamReference] = js.native
  /**
    * Gets properties for the user.
    * @param values The properties to get. Use the KnownUserProperties class to obtain property names.
    * @return When this method completes, it returns the requested properties. If a property is missing or unavailable, it is reported as an empty string.
    */
  def getPropertiesAsync(values: IVectorView[String]): IPromiseWithIAsyncOperation[IPropertySet] = js.native
  /**
    * Gets a property for the user. Use the KnownUserProperties class to obtain property names.
    * @param value The property to get.
    * @return When this method completes, it returns the requested property. If the property is missing or unavailable, an empty string is returned.
    */
  def getPropertyAsync(value: String): IPromiseWithIAsyncOperation[_] = js.native
}

/* static members */
@JSGlobal("Windows.System.User")
@js.native
object User extends js.Object {
  /**
    * Creates a UserWatcher which enumerates users and raises events when the collection of users changes or when a user’s authentication state changes.
    * @return A UserWatcher which enumerates users and raises events when the collection of users changes.
    */
  def createWatcher(): UserWatcher = js.native
  /**
    * Finds all users asynchronously.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of Users .
    */
  def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Finds all users of a given type asynchronously.
    * @param type The type of users to find.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of Users .
    */
  def findAllAsync(`type`: UserType): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Finds all users of a given type and authentication status asynchronously.
    * @param type The type of users to find.
    * @param status The authentication status of users to find.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of Users .
    */
  def findAllAsync(`type`: UserType, status: UserAuthenticationStatus): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets a user with a given Id.
    * @param nonRoamableId The Id of the user to get.
    * @return The user with the given Id.
    */
  def getFromId(nonRoamableId: String): User = js.native
}

