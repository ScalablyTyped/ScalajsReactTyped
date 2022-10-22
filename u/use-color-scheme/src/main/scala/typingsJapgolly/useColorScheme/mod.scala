package typingsJapgolly.useColorScheme

import org.scalajs.dom.MediaQueryList
import typingsJapgolly.useColorScheme.anon.Scheme
import typingsJapgolly.useColorScheme.useColorSchemeStrings.`no-preference`
import typingsJapgolly.useColorScheme.useColorSchemeStrings.dark
import typingsJapgolly.useColorScheme.useColorSchemeStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-color-scheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object PREFERENCES {
    
    @JSImport("use-color-scheme", "PREFERENCES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("use-color-scheme", "PREFERENCES.DARK")
    @js.native
    def DARK: dark = js.native
    inline def DARK_=(x: dark): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARK")(x.asInstanceOf[js.Any])
    
    @JSImport("use-color-scheme", "PREFERENCES.LIGHT")
    @js.native
    def LIGHT: light = js.native
    inline def LIGHT_=(x: light): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("use-color-scheme", "PREFERENCES.NONE")
    @js.native
    def NONE: `no-preference` = js.native
    inline def NONE_=(x: `no-preference`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
  }
  
  inline def attachListener(pref: Preference, setScheme: js.Function1[/* pref */ Preference, Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachListener")(pref.asInstanceOf[js.Any], setScheme.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def getPreference(preferences: js.Array[Preference]): Preference = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreference")(preferences.asInstanceOf[js.Any]).asInstanceOf[Preference]
  
  inline def makeQuery(pref: Preference): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeQuery")(pref.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def matchPreference(pref: Preference): MediaQueryList = ^.asInstanceOf[js.Dynamic].applyDynamic("matchPreference")(pref.asInstanceOf[js.Any]).asInstanceOf[MediaQueryList]
  
  inline def useColorScheme(): Scheme = ^.asInstanceOf[js.Dynamic].applyDynamic("useColorScheme")().asInstanceOf[Scheme]
  
  @JSImport("use-color-scheme", "values")
  @js.native
  val values: js.Array[dark | light | `no-preference`] = js.native
  
  /* Inlined {  DARK :'dark',   LIGHT :'light',   NONE :'no-preference'}[keyof {  DARK :'dark',   LIGHT :'light',   NONE :'no-preference'}] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.useColorScheme.useColorSchemeStrings.dark
    - typingsJapgolly.useColorScheme.useColorSchemeStrings.light
    - typingsJapgolly.useColorScheme.useColorSchemeStrings.`no-preference`
  */
  trait Preference extends StObject
  object Preference {
    
    inline def dark: typingsJapgolly.useColorScheme.useColorSchemeStrings.dark = "dark".asInstanceOf[typingsJapgolly.useColorScheme.useColorSchemeStrings.dark]
    
    inline def light: typingsJapgolly.useColorScheme.useColorSchemeStrings.light = "light".asInstanceOf[typingsJapgolly.useColorScheme.useColorSchemeStrings.light]
    
    inline def `no-preference`: typingsJapgolly.useColorScheme.useColorSchemeStrings.`no-preference` = "no-preference".asInstanceOf[typingsJapgolly.useColorScheme.useColorSchemeStrings.`no-preference`]
  }
}
