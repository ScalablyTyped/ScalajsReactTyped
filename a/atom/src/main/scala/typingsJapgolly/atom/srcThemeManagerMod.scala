package typingsJapgolly.atom

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atom.mod.Disposable
import typingsJapgolly.atom.srcPackageMod.Package
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcThemeManagerMod {
  
  trait ThemeManager extends StObject {
    
    // Managing Enabled Themes
    /** Returns an Array of strings all the active theme names. */
    def getActiveThemeNames(): js.UndefOr[js.Array[String]]
    
    /** Returns an Array of all the active themes. */
    def getActiveThemes(): js.UndefOr[js.Array[Package]]
    
    // Managing Enabled Themes
    /** Get the enabled theme names from the config. */
    def getEnabledThemeNames(): js.Array[String]
    
    // Accessing Loaded Themes
    /** Returns an Array of strings of all the loaded theme names. */
    def getLoadedThemeNames(): js.UndefOr[js.Array[String]]
    
    /** Returns an Array of all the loaded themes. */
    def getLoadedThemes(): js.UndefOr[js.Array[Package]]
    
    // Event Subscription
    /**
      *  Invoke callback when style sheet changes associated with updating the
      *  list of active themes have completed.
      */
    def onDidChangeActiveThemes(callback: js.Function0[Unit]): Disposable
  }
  object ThemeManager {
    
    inline def apply(
      getActiveThemeNames: CallbackTo[js.UndefOr[js.Array[String]]],
      getActiveThemes: CallbackTo[js.UndefOr[js.Array[Package]]],
      getEnabledThemeNames: CallbackTo[js.Array[String]],
      getLoadedThemeNames: CallbackTo[js.UndefOr[js.Array[String]]],
      getLoadedThemes: CallbackTo[js.UndefOr[js.Array[Package]]],
      onDidChangeActiveThemes: js.Function0[Unit] => Disposable
    ): ThemeManager = {
      val __obj = js.Dynamic.literal(getActiveThemeNames = getActiveThemeNames.toJsFn, getActiveThemes = getActiveThemes.toJsFn, getEnabledThemeNames = getEnabledThemeNames.toJsFn, getLoadedThemeNames = getLoadedThemeNames.toJsFn, getLoadedThemes = getLoadedThemes.toJsFn, onDidChangeActiveThemes = js.Any.fromFunction1(onDidChangeActiveThemes))
      __obj.asInstanceOf[ThemeManager]
    }
    
    extension [Self <: ThemeManager](x: Self) {
      
      inline def setGetActiveThemeNames(value: CallbackTo[js.UndefOr[js.Array[String]]]): Self = StObject.set(x, "getActiveThemeNames", value.toJsFn)
      
      inline def setGetActiveThemes(value: CallbackTo[js.UndefOr[js.Array[Package]]]): Self = StObject.set(x, "getActiveThemes", value.toJsFn)
      
      inline def setGetEnabledThemeNames(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getEnabledThemeNames", value.toJsFn)
      
      inline def setGetLoadedThemeNames(value: CallbackTo[js.UndefOr[js.Array[String]]]): Self = StObject.set(x, "getLoadedThemeNames", value.toJsFn)
      
      inline def setGetLoadedThemes(value: CallbackTo[js.UndefOr[js.Array[Package]]]): Self = StObject.set(x, "getLoadedThemes", value.toJsFn)
      
      inline def setOnDidChangeActiveThemes(value: js.Function0[Unit] => Disposable): Self = StObject.set(x, "onDidChangeActiveThemes", js.Any.fromFunction1(value))
    }
  }
}
