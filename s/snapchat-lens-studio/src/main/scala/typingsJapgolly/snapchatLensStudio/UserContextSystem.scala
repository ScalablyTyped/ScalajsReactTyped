package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the user such as display name, birthday,
  * and current weather. Accessible through global.userContextSystem.
  *
  * All callbacks will execute as soon as the requested information is available.
  * In some rare cases, the requested information may be completely unavailable,
  * and the callback will never occur.
  *
  * Note that formatted or localized strings may appear differently to users
  * depending on their region.
  */
trait UserContextSystem
  extends StObject
     with ScriptObject {
  
  /** Provides the user’s current altitude as a localized string. */
  def requestAltitudeFormatted(callback: js.Function1[/* formattedData */ String, Unit]): Unit
  
  /** Provides the user’s current altitude in meters. */
  def requestAltitudeInMeters(callback: js.Function1[/* data */ Double, Unit]): Unit
  
  /** Provides the user’s birth date as a Date object. */
  def requestBirthdate(callback: js.Function1[/* data */ js.Date, Unit]): Unit
  
  /** Provides the user’s birth date as localized string. */
  def requestBirthdateFormatted(callback: js.Function1[/* formattedData */ String, Unit]): Unit
  
  /** Provides the name of the city the user is currently located in. */
  def requestCity(callback: js.Function1[/* data */ String, Unit]): Unit
  
  /** Provides the user’s display name. */
  def requestDisplayName(callback: js.Function1[/* data */ String, Unit]): Unit
  
  /** Provides the user’s current temperature in celsius. */
  def requestTemperatureCelsius(callback: js.Function1[/* data */ Double, Unit]): Unit
  
  /** Provides the user’s current temperature in fahrenheit. */
  def requestTemperatureFahrenheit(callback: js.Function1[/* data */ Double, Unit]): Unit
  
  /** Provides the user’s current temperature as a localized string. */
  def requestTemperatureFormatted(callback: js.Function1[/* formattedData */ String, Unit]): Unit
  
  /** Provides the user’s current weather condition. */
  def requestWeatherCondition(callback: js.Function1[/* data */ WeatherCondition, Unit]): Unit
  
  /** Provides the user’s current weather condition as a localized string. */
  def requestWeatherLocalized(callback: js.Function1[/* formattedData */ String, Unit]): Unit
}
object UserContextSystem {
  
  inline def apply(
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean,
    requestAltitudeFormatted: js.Function1[/* formattedData */ String, Unit] => Callback,
    requestAltitudeInMeters: js.Function1[/* data */ Double, Unit] => Callback,
    requestBirthdate: js.Function1[/* data */ js.Date, Unit] => Callback,
    requestBirthdateFormatted: js.Function1[/* formattedData */ String, Unit] => Callback,
    requestCity: js.Function1[/* data */ String, Unit] => Callback,
    requestDisplayName: js.Function1[/* data */ String, Unit] => Callback,
    requestTemperatureCelsius: js.Function1[/* data */ Double, Unit] => Callback,
    requestTemperatureFahrenheit: js.Function1[/* data */ Double, Unit] => Callback,
    requestTemperatureFormatted: js.Function1[/* formattedData */ String, Unit] => Callback,
    requestWeatherCondition: js.Function1[/* data */ WeatherCondition, Unit] => Callback,
    requestWeatherLocalized: js.Function1[/* formattedData */ String, Unit] => Callback
  ): UserContextSystem = {
    val __obj = js.Dynamic.literal(getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType), requestAltitudeFormatted = js.Any.fromFunction1((t0: js.Function1[/* formattedData */ String, Unit]) => requestAltitudeFormatted(t0).runNow()), requestAltitudeInMeters = js.Any.fromFunction1((t0: js.Function1[/* data */ Double, Unit]) => requestAltitudeInMeters(t0).runNow()), requestBirthdate = js.Any.fromFunction1((t0: js.Function1[/* data */ js.Date, Unit]) => requestBirthdate(t0).runNow()), requestBirthdateFormatted = js.Any.fromFunction1((t0: js.Function1[/* formattedData */ String, Unit]) => requestBirthdateFormatted(t0).runNow()), requestCity = js.Any.fromFunction1((t0: js.Function1[/* data */ String, Unit]) => requestCity(t0).runNow()), requestDisplayName = js.Any.fromFunction1((t0: js.Function1[/* data */ String, Unit]) => requestDisplayName(t0).runNow()), requestTemperatureCelsius = js.Any.fromFunction1((t0: js.Function1[/* data */ Double, Unit]) => requestTemperatureCelsius(t0).runNow()), requestTemperatureFahrenheit = js.Any.fromFunction1((t0: js.Function1[/* data */ Double, Unit]) => requestTemperatureFahrenheit(t0).runNow()), requestTemperatureFormatted = js.Any.fromFunction1((t0: js.Function1[/* formattedData */ String, Unit]) => requestTemperatureFormatted(t0).runNow()), requestWeatherCondition = js.Any.fromFunction1((t0: js.Function1[/* data */ WeatherCondition, Unit]) => requestWeatherCondition(t0).runNow()), requestWeatherLocalized = js.Any.fromFunction1((t0: js.Function1[/* formattedData */ String, Unit]) => requestWeatherLocalized(t0).runNow()))
    __obj.asInstanceOf[UserContextSystem]
  }
  
  extension [Self <: UserContextSystem](x: Self) {
    
    inline def setRequestAltitudeFormatted(value: js.Function1[/* formattedData */ String, Unit] => Callback): Self = StObject.set(x, "requestAltitudeFormatted", js.Any.fromFunction1((t0: js.Function1[/* formattedData */ String, Unit]) => value(t0).runNow()))
    
    inline def setRequestAltitudeInMeters(value: js.Function1[/* data */ Double, Unit] => Callback): Self = StObject.set(x, "requestAltitudeInMeters", js.Any.fromFunction1((t0: js.Function1[/* data */ Double, Unit]) => value(t0).runNow()))
    
    inline def setRequestBirthdate(value: js.Function1[/* data */ js.Date, Unit] => Callback): Self = StObject.set(x, "requestBirthdate", js.Any.fromFunction1((t0: js.Function1[/* data */ js.Date, Unit]) => value(t0).runNow()))
    
    inline def setRequestBirthdateFormatted(value: js.Function1[/* formattedData */ String, Unit] => Callback): Self = StObject.set(x, "requestBirthdateFormatted", js.Any.fromFunction1((t0: js.Function1[/* formattedData */ String, Unit]) => value(t0).runNow()))
    
    inline def setRequestCity(value: js.Function1[/* data */ String, Unit] => Callback): Self = StObject.set(x, "requestCity", js.Any.fromFunction1((t0: js.Function1[/* data */ String, Unit]) => value(t0).runNow()))
    
    inline def setRequestDisplayName(value: js.Function1[/* data */ String, Unit] => Callback): Self = StObject.set(x, "requestDisplayName", js.Any.fromFunction1((t0: js.Function1[/* data */ String, Unit]) => value(t0).runNow()))
    
    inline def setRequestTemperatureCelsius(value: js.Function1[/* data */ Double, Unit] => Callback): Self = StObject.set(x, "requestTemperatureCelsius", js.Any.fromFunction1((t0: js.Function1[/* data */ Double, Unit]) => value(t0).runNow()))
    
    inline def setRequestTemperatureFahrenheit(value: js.Function1[/* data */ Double, Unit] => Callback): Self = StObject.set(x, "requestTemperatureFahrenheit", js.Any.fromFunction1((t0: js.Function1[/* data */ Double, Unit]) => value(t0).runNow()))
    
    inline def setRequestTemperatureFormatted(value: js.Function1[/* formattedData */ String, Unit] => Callback): Self = StObject.set(x, "requestTemperatureFormatted", js.Any.fromFunction1((t0: js.Function1[/* formattedData */ String, Unit]) => value(t0).runNow()))
    
    inline def setRequestWeatherCondition(value: js.Function1[/* data */ WeatherCondition, Unit] => Callback): Self = StObject.set(x, "requestWeatherCondition", js.Any.fromFunction1((t0: js.Function1[/* data */ WeatherCondition, Unit]) => value(t0).runNow()))
    
    inline def setRequestWeatherLocalized(value: js.Function1[/* formattedData */ String, Unit] => Callback): Self = StObject.set(x, "requestWeatherLocalized", js.Any.fromFunction1((t0: js.Function1[/* formattedData */ String, Unit]) => value(t0).runNow()))
  }
}
