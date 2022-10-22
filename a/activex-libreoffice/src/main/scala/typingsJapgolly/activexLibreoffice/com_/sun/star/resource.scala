package typingsJapgolly.activexLibreoffice.com_.sun.star

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.RuntimeException
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resource {
  
  /**
    * is used to signal that a resource is missing.
    * @see XResourceBundle
    */
  type MissingResourceException = RuntimeException
  
  /**
    * describes a {@link XResourceBundleLoader} which provides access to the OpenOffice.org resource files.
    *
    * An OpenOffice.org installation comes with a number of resource files in an proprietary format, located inside the installation's program/resource
    * directory. The {@link OfficeResourceLoader} singleton (available at a component context as value with the key
    * `/singletons/com.sun.star.resource.OfficeResourceLoader` ), provides access to some types of resources within those files.
    *
    * Clients have to specify the resource file base name in the call to {@link XResourceBundleLoader.loadBundle()} resp. {@link
    * XResourceBundleLoader.loadBundle_Default()} method. The loader will extent this base name so that the resulting name conforms to the OpenOffice.org
    * resource file naming conventions, and look up the respective resource file, for the requested locale, in OpenOffice.org's installation.
    *
    * The lookup process uses the fallback mechanism as described at the {@link XResourceBundle} interface, except that `Locale.getDefault()` is not used.
    *
    * Resource keys, as passed to the {@link XResourceBundle.getDirectElement()} or {@link com.sun.star.container.XNameAccess.getByName()} , have the
    * following format: `<resource_type>:<numeric_identifier>` , where `<resource_type>` specifies the type of the requested resource (see below) and
    * `<numeric_identifier>` is the numeric identifier of the resource.
    *
    * The following resource types are currently supported: **string** : denotes a string resource
    *
    * Since the numeric resource identifiers are highly build-dependent (e.g. can change with any next OpenOffice.org build), you are **strongly**
    * discouraged from using the OfficeResoureLoader service in a component which targets more than one particular OpenOffice.org build.
    * @since OOo 2.0.3
    */
  type OfficeResourceLoader = XResourceBundleLoader
  
  /** specifies a service providing access to a resource string table implementing the {@link com.sun.star.awt.XDialog} interface. */
  type StringResource = XStringResourcePersistence
  
  /** specifies a service providing access to a resource string table implementing the {@link com.sun.star.resource.XStringResourceWithLocation} interface. */
  trait StringResourceWithLocation
    extends StObject
       with XStringResourceWithLocation {
    
    /**
      * is used to initialize the object on its creation.
      * @param URL Specifies the location used to load and store - if the ReadOnly state allows it - the string table data.
      * @param ReadOnly Specifies if the resource should be read only, see `XStringResourceManager::isReadOnly`
      * @param locale Specifies if the locale first to be used as current locale. Internally the `XStringResourceManager::setCurrentLocale` method is called wit
      * @param BaseName Base string for the file names used to store the locale data. The locale data is stored in Java properties files also following the corr
      * @param Comment Comment stored first in each properties file followed by a line feed character. The line feed character is added automatically and hasn't
      * @param Handler a {@link com.sun.star.task.XInteractionHandler} to be passed to ucb. This may be a null interface.
      * @throws com::sun::star::lang::IllegalArgumentException if no string or an empty string is passed as URL
      */
    def create(
      URL: String,
      ReadOnly: Boolean,
      locale: Locale,
      BaseName: String,
      Comment: String,
      Handler: XInteractionHandler
    ): Unit
  }
  object StringResourceWithLocation {
    
    inline def apply(
      CurrentLocale: Locale,
      DefaultLocale: Locale,
      Locales: SafeArray[Locale],
      ResourceIDs: SafeArray[String],
      UniqueNumericId: Double,
      acquire: Callback,
      addModifyListener: XModifyListener => Callback,
      create: (String, Boolean, Locale, String, String, XInteractionHandler) => Callback,
      exportBinary: CallbackTo[SafeArray[Double]],
      getCurrentLocale: CallbackTo[Locale],
      getDefaultLocale: CallbackTo[Locale],
      getLocales: CallbackTo[SafeArray[Locale]],
      getResourceIDs: CallbackTo[SafeArray[String]],
      getResourceIDsForLocale: Locale => SafeArray[String],
      getUniqueNumericId: CallbackTo[Double],
      hasEntryForId: String => Boolean,
      hasEntryForIdAndLocale: (String, Locale) => Boolean,
      importBinary: SeqEquiv[Double] => Callback,
      isModified: CallbackTo[Boolean],
      isReadOnly: CallbackTo[Boolean],
      newLocale: Locale => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      removeId: String => Callback,
      removeIdForLocale: (String, Locale) => Callback,
      removeLocale: Locale => Callback,
      removeModifyListener: XModifyListener => Callback,
      resolveString: String => String,
      resolveStringForLocale: (String, Locale) => String,
      setComment: String => Callback,
      setCurrentLocale: (Locale, Boolean) => Callback,
      setDefaultLocale: Locale => Callback,
      setString: (String, String) => Callback,
      setStringForLocale: (String, String, Locale) => Callback,
      setURL: String => Callback,
      store: Callback,
      storeAsURL: String => Callback,
      storeToStorage: (XStorage, String, String) => Callback,
      storeToURL: (String, String, String, XInteractionHandler) => Callback
    ): StringResourceWithLocation = {
      val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale.asInstanceOf[js.Any], DefaultLocale = DefaultLocale.asInstanceOf[js.Any], Locales = Locales.asInstanceOf[js.Any], ResourceIDs = ResourceIDs.asInstanceOf[js.Any], UniqueNumericId = UniqueNumericId.asInstanceOf[js.Any], acquire = acquire.toJsFn, addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), create = js.Any.fromFunction6((t0: String, t1: Boolean, t2: Locale, t3: String, t4: String, t5: XInteractionHandler) => (create(t0, t1, t2, t3, t4, t5)).runNow()), exportBinary = exportBinary.toJsFn, getCurrentLocale = getCurrentLocale.toJsFn, getDefaultLocale = getDefaultLocale.toJsFn, getLocales = getLocales.toJsFn, getResourceIDs = getResourceIDs.toJsFn, getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), getUniqueNumericId = getUniqueNumericId.toJsFn, hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), importBinary = js.Any.fromFunction1((t0: SeqEquiv[Double]) => importBinary(t0).runNow()), isModified = isModified.toJsFn, isReadOnly = isReadOnly.toJsFn, newLocale = js.Any.fromFunction1((t0: Locale) => newLocale(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeId = js.Any.fromFunction1((t0: String) => removeId(t0).runNow()), removeIdForLocale = js.Any.fromFunction2((t0: String, t1: Locale) => (removeIdForLocale(t0, t1)).runNow()), removeLocale = js.Any.fromFunction1((t0: Locale) => removeLocale(t0).runNow()), removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale), setComment = js.Any.fromFunction1((t0: String) => setComment(t0).runNow()), setCurrentLocale = js.Any.fromFunction2((t0: Locale, t1: Boolean) => (setCurrentLocale(t0, t1)).runNow()), setDefaultLocale = js.Any.fromFunction1((t0: Locale) => setDefaultLocale(t0).runNow()), setString = js.Any.fromFunction2((t0: String, t1: String) => (setString(t0, t1)).runNow()), setStringForLocale = js.Any.fromFunction3((t0: String, t1: String, t2: Locale) => (setStringForLocale(t0, t1, t2)).runNow()), setURL = js.Any.fromFunction1((t0: String) => setURL(t0).runNow()), store = store.toJsFn, storeAsURL = js.Any.fromFunction1((t0: String) => storeAsURL(t0).runNow()), storeToStorage = js.Any.fromFunction3((t0: XStorage, t1: String, t2: String) => (storeToStorage(t0, t1, t2)).runNow()), storeToURL = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: XInteractionHandler) => (storeToURL(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[StringResourceWithLocation]
    }
    
    extension [Self <: StringResourceWithLocation](x: Self) {
      
      inline def setCreate(value: (String, Boolean, Locale, String, String, XInteractionHandler) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction6((t0: String, t1: Boolean, t2: Locale, t3: String, t4: String, t5: XInteractionHandler) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    }
  }
  
  /** specifies a service providing access to a resource string table implementing the {@link com.sun.star.resource.XStringResourceWithStorage} interface. */
  trait StringResourceWithStorage
    extends StObject
       with XStringResourceWithStorage {
    
    /**
      * is used to initialize the object on its creation.
      * @param Storage Specifies the storage used to load and store - if the ReadOnly state allows it - the string table data.
      * @param ReadOnly Specifies if the resource should be read only, see `XStringResourceManager::isReadOnly`
      * @param locale Specifies if the locale first to be used as current locale. Internally the `XStringResourceManager::setCurrentLocale` method is called wit
      * @param BaseName Base string for the file names used to store the locale data. The locale data is stored in Java properties files also following the corr
      * @param Comment Comment stored first in each properties file followed by a line feed character. The line feed character is added automatically and hasn't
      * @throws com::sun::star::lang::IllegalArgumentException if a null interface is passed as Storage
      */
    def create(Storage: XStorage, ReadOnly: Boolean, locale: Locale, BaseName: String, Comment: String): Unit
  }
  object StringResourceWithStorage {
    
    inline def apply(
      CurrentLocale: Locale,
      DefaultLocale: Locale,
      Locales: SafeArray[Locale],
      ResourceIDs: SafeArray[String],
      UniqueNumericId: Double,
      acquire: Callback,
      addModifyListener: XModifyListener => Callback,
      create: (XStorage, Boolean, Locale, String, String) => Callback,
      exportBinary: CallbackTo[SafeArray[Double]],
      getCurrentLocale: CallbackTo[Locale],
      getDefaultLocale: CallbackTo[Locale],
      getLocales: CallbackTo[SafeArray[Locale]],
      getResourceIDs: CallbackTo[SafeArray[String]],
      getResourceIDsForLocale: Locale => SafeArray[String],
      getUniqueNumericId: CallbackTo[Double],
      hasEntryForId: String => Boolean,
      hasEntryForIdAndLocale: (String, Locale) => Boolean,
      importBinary: SeqEquiv[Double] => Callback,
      isModified: CallbackTo[Boolean],
      isReadOnly: CallbackTo[Boolean],
      newLocale: Locale => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      removeId: String => Callback,
      removeIdForLocale: (String, Locale) => Callback,
      removeLocale: Locale => Callback,
      removeModifyListener: XModifyListener => Callback,
      resolveString: String => String,
      resolveStringForLocale: (String, Locale) => String,
      setComment: String => Callback,
      setCurrentLocale: (Locale, Boolean) => Callback,
      setDefaultLocale: Locale => Callback,
      setStorage: XStorage => Callback,
      setString: (String, String) => Callback,
      setStringForLocale: (String, String, Locale) => Callback,
      store: Callback,
      storeAsStorage: XStorage => Callback,
      storeToStorage: (XStorage, String, String) => Callback,
      storeToURL: (String, String, String, XInteractionHandler) => Callback
    ): StringResourceWithStorage = {
      val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale.asInstanceOf[js.Any], DefaultLocale = DefaultLocale.asInstanceOf[js.Any], Locales = Locales.asInstanceOf[js.Any], ResourceIDs = ResourceIDs.asInstanceOf[js.Any], UniqueNumericId = UniqueNumericId.asInstanceOf[js.Any], acquire = acquire.toJsFn, addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), create = js.Any.fromFunction5((t0: XStorage, t1: Boolean, t2: Locale, t3: String, t4: String) => (create(t0, t1, t2, t3, t4)).runNow()), exportBinary = exportBinary.toJsFn, getCurrentLocale = getCurrentLocale.toJsFn, getDefaultLocale = getDefaultLocale.toJsFn, getLocales = getLocales.toJsFn, getResourceIDs = getResourceIDs.toJsFn, getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), getUniqueNumericId = getUniqueNumericId.toJsFn, hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), importBinary = js.Any.fromFunction1((t0: SeqEquiv[Double]) => importBinary(t0).runNow()), isModified = isModified.toJsFn, isReadOnly = isReadOnly.toJsFn, newLocale = js.Any.fromFunction1((t0: Locale) => newLocale(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeId = js.Any.fromFunction1((t0: String) => removeId(t0).runNow()), removeIdForLocale = js.Any.fromFunction2((t0: String, t1: Locale) => (removeIdForLocale(t0, t1)).runNow()), removeLocale = js.Any.fromFunction1((t0: Locale) => removeLocale(t0).runNow()), removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale), setComment = js.Any.fromFunction1((t0: String) => setComment(t0).runNow()), setCurrentLocale = js.Any.fromFunction2((t0: Locale, t1: Boolean) => (setCurrentLocale(t0, t1)).runNow()), setDefaultLocale = js.Any.fromFunction1((t0: Locale) => setDefaultLocale(t0).runNow()), setStorage = js.Any.fromFunction1((t0: XStorage) => setStorage(t0).runNow()), setString = js.Any.fromFunction2((t0: String, t1: String) => (setString(t0, t1)).runNow()), setStringForLocale = js.Any.fromFunction3((t0: String, t1: String, t2: Locale) => (setStringForLocale(t0, t1, t2)).runNow()), store = store.toJsFn, storeAsStorage = js.Any.fromFunction1((t0: XStorage) => storeAsStorage(t0).runNow()), storeToStorage = js.Any.fromFunction3((t0: XStorage, t1: String, t2: String) => (storeToStorage(t0, t1, t2)).runNow()), storeToURL = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: XInteractionHandler) => (storeToURL(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[StringResourceWithStorage]
    }
    
    extension [Self <: StringResourceWithStorage](x: Self) {
      
      inline def setCreate(value: (XStorage, Boolean, Locale, String, String) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction5((t0: XStorage, t1: Boolean, t2: Locale, t3: String, t4: String) => (value(t0, t1, t2, t3, t4)).runNow()))
    }
  }
  
  /**
    * offers some operations on {@link com.sun.star.lang.Locale} structures.
    * @see XResourceBundle
    * @see Locale
    */
  trait XLocale
    extends StObject
       with XInterface {
    
    /** @returns a sequence of all locales which are available in the system. */
    val AvailableLocales: SafeArray[Locale]
    
    /**
      * the common method of getting the current default locale.
      *
      * It is used for the presentation (for menus, dialogs, etc.). It is, generally, set once when your applet or application is initialized, then never
      * reset. (If you do reset the default locale, you probably want to reload your GUI, so that the change is reflected in your interface.)
      *
      * More advanced programs allow users to use different locales for different fields, for example, in a spreadsheet.
      *
      * ;  Note that the initial setting will match the host system.
      */
    var Default: Locale
    
    /** @returns a sequence of all ISO country codes known to the component. */
    val ISOCountries: SafeArray[String]
    
    /** @returns a sequence of all ISO language codes known to the component. */
    val ISOLanguages: SafeArray[String]
    
    /**
      * creates a locale from language, country, and variant.
      *
      * NOTE: ISO 639 is not a stable standard; some of the language codes it defines (specifically iw, ji, and in) have changed. This constructor accepts
      * both the old codes (iw, ji, and in) and the new codes (he, yi, and id), but all other API on {@link XLocale} will return only the **NEW** codes.
      *
      * Note: The Java class `Locale` returns the **old** codes.
      */
    def create(aLanguage: String, aCountry: String, aVariant: String): Locale
    
    /** @returns `TRUE` if the {@link com.sun.star.lang.Locale}**l1** is equal to the other one.  A locale is deemed equal to another locale with identical langua */
    def equals(l1: Locale, l2: Locale): Boolean
    
    /** @returns a sequence of all locales which are available in the system. */
    def getAvailableLocales(): SafeArray[Locale]
    
    /**
      * the common method of getting the current default locale.
      *
      * It is used for the presentation (for menus, dialogs, etc.). It is, generally, set once when your applet or application is initialized, then never
      * reset. (If you do reset the default locale, you probably want to reload your GUI, so that the change is reflected in your interface.)
      *
      * More advanced programs allow users to use different locales for different fields, for example, in a spreadsheet.
      *
      * ;  Note that the initial setting will match the host system.
      */
    def getDefault(): Locale
    
    /**
      * @param locale the locale.
      * @param inLocale specifies the desired user country.
      * @returns country code for display of field to user. If the localized name is not found, returns the ISO codes.
      */
    def getDisplayCountry(locale: Locale, inLocale: Locale): String
    
    /** @returns country code for display of field to user. If the localized name is not found, returns the ISO code. The desired user country is from the default */
    def getDisplayCountry_Default(locale: Locale): String
    
    /**
      * @param locale the locale.
      * @param inLocale specifies the desired user language.
      * @returns language code for display of field to user. If the localized name is not found, returns the ISO codes.
      */
    def getDisplayLanguage(locale: Locale, inLocale: Locale): String
    
    /** @returns language code for display of field to user. If the localized name is not found, returns the ISO code. The desired user language is from the defau */
    def getDisplayLanguage_Default(locale: Locale): String
    
    /**
      * @param locale the locale.
      * @param inLocale specifies the desired user locale.
      * @returns a string to display the entire locale to user. If the localized name is not found, uses the ISO codes.
      */
    def getDisplayName(locale: Locale, inLocale: Locale): String
    
    /**
      * @param locale the locale.
      * @returns a string to display the entire locale to user. If the localized name is not found, uses the ISO codes. The default locale is used for the present
      */
    def getDisplayName_Default(locale: Locale): String
    
    /**
      * @param locale the locale.
      * @param inLocale specifies the desired user variant.
      * @returns variant code for display of field to user. If the localized name is not found, returns the ISO codes.
      */
    def getDisplayVariant(locale: Locale, inLocale: Locale): String
    
    /** @returns variant code for display of field to user. The desired user variant is from the default locale. */
    def getDisplayVariant_Default(locale: Locale): String
    
    /** @returns the ISO country code for the specified locale. */
    def getISO3Country(locale: Locale): String
    
    /** @returns the ISO language code for the specified locale. */
    def getISO3Language(locale: Locale): String
    
    /** @returns a sequence of all ISO country codes known to the component. */
    def getISOCountries(): SafeArray[String]
    
    /** @returns a sequence of all ISO language codes known to the component. */
    def getISOLanguages(): SafeArray[String]
    
    /** @returns a sequence for language codes which are valid within the given country. */
    def getLanguagesForCountry(country: String): SafeArray[String]
    
    /**
      * sets the default locale for the whole environment.
      *
      * It is normally set once at the beginning of an application, then never reset. `setDefault` does not reset the host locale.
      */
    def setDefault(newLocale: Locale): Unit
  }
  object XLocale {
    
    inline def apply(
      AvailableLocales: SafeArray[Locale],
      Default: Locale,
      ISOCountries: SafeArray[String],
      ISOLanguages: SafeArray[String],
      acquire: Callback,
      create: (String, String, String) => Locale,
      equals_ : (Locale, Locale) => Boolean,
      getAvailableLocales: CallbackTo[SafeArray[Locale]],
      getDefault: CallbackTo[Locale],
      getDisplayCountry: (Locale, Locale) => String,
      getDisplayCountry_Default: Locale => String,
      getDisplayLanguage: (Locale, Locale) => String,
      getDisplayLanguage_Default: Locale => String,
      getDisplayName: (Locale, Locale) => String,
      getDisplayName_Default: Locale => String,
      getDisplayVariant: (Locale, Locale) => String,
      getDisplayVariant_Default: Locale => String,
      getISO3Country: Locale => String,
      getISO3Language: Locale => String,
      getISOCountries: CallbackTo[SafeArray[String]],
      getISOLanguages: CallbackTo[SafeArray[String]],
      getLanguagesForCountry: String => SafeArray[String],
      queryInterface: `type` => Any,
      release: Callback,
      setDefault: Locale => Callback
    ): XLocale = {
      val __obj = js.Dynamic.literal(AvailableLocales = AvailableLocales.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], ISOCountries = ISOCountries.asInstanceOf[js.Any], ISOLanguages = ISOLanguages.asInstanceOf[js.Any], acquire = acquire.toJsFn, create = js.Any.fromFunction3(create), getAvailableLocales = getAvailableLocales.toJsFn, getDefault = getDefault.toJsFn, getDisplayCountry = js.Any.fromFunction2(getDisplayCountry), getDisplayCountry_Default = js.Any.fromFunction1(getDisplayCountry_Default), getDisplayLanguage = js.Any.fromFunction2(getDisplayLanguage), getDisplayLanguage_Default = js.Any.fromFunction1(getDisplayLanguage_Default), getDisplayName = js.Any.fromFunction2(getDisplayName), getDisplayName_Default = js.Any.fromFunction1(getDisplayName_Default), getDisplayVariant = js.Any.fromFunction2(getDisplayVariant), getDisplayVariant_Default = js.Any.fromFunction1(getDisplayVariant_Default), getISO3Country = js.Any.fromFunction1(getISO3Country), getISO3Language = js.Any.fromFunction1(getISO3Language), getISOCountries = getISOCountries.toJsFn, getISOLanguages = getISOLanguages.toJsFn, getLanguagesForCountry = js.Any.fromFunction1(getLanguagesForCountry), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDefault = js.Any.fromFunction1((t0: Locale) => setDefault(t0).runNow()))
      __obj.updateDynamic("equals")(js.Any.fromFunction2(equals_))
      __obj.asInstanceOf[XLocale]
    }
    
    extension [Self <: XLocale](x: Self) {
      
      inline def setAvailableLocales(value: SafeArray[Locale]): Self = StObject.set(x, "AvailableLocales", value.asInstanceOf[js.Any])
      
      inline def setCreate(value: (String, String, String) => Locale): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      inline def setDefault(value: Locale): Self = StObject.set(x, "Default", value.asInstanceOf[js.Any])
      
      inline def setEquals_(value: (Locale, Locale) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      inline def setGetAvailableLocales(value: CallbackTo[SafeArray[Locale]]): Self = StObject.set(x, "getAvailableLocales", value.toJsFn)
      
      inline def setGetDefault(value: CallbackTo[Locale]): Self = StObject.set(x, "getDefault", value.toJsFn)
      
      inline def setGetDisplayCountry(value: (Locale, Locale) => String): Self = StObject.set(x, "getDisplayCountry", js.Any.fromFunction2(value))
      
      inline def setGetDisplayCountry_Default(value: Locale => String): Self = StObject.set(x, "getDisplayCountry_Default", js.Any.fromFunction1(value))
      
      inline def setGetDisplayLanguage(value: (Locale, Locale) => String): Self = StObject.set(x, "getDisplayLanguage", js.Any.fromFunction2(value))
      
      inline def setGetDisplayLanguage_Default(value: Locale => String): Self = StObject.set(x, "getDisplayLanguage_Default", js.Any.fromFunction1(value))
      
      inline def setGetDisplayName(value: (Locale, Locale) => String): Self = StObject.set(x, "getDisplayName", js.Any.fromFunction2(value))
      
      inline def setGetDisplayName_Default(value: Locale => String): Self = StObject.set(x, "getDisplayName_Default", js.Any.fromFunction1(value))
      
      inline def setGetDisplayVariant(value: (Locale, Locale) => String): Self = StObject.set(x, "getDisplayVariant", js.Any.fromFunction2(value))
      
      inline def setGetDisplayVariant_Default(value: Locale => String): Self = StObject.set(x, "getDisplayVariant_Default", js.Any.fromFunction1(value))
      
      inline def setGetISO3Country(value: Locale => String): Self = StObject.set(x, "getISO3Country", js.Any.fromFunction1(value))
      
      inline def setGetISO3Language(value: Locale => String): Self = StObject.set(x, "getISO3Language", js.Any.fromFunction1(value))
      
      inline def setGetISOCountries(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getISOCountries", value.toJsFn)
      
      inline def setGetISOLanguages(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getISOLanguages", value.toJsFn)
      
      inline def setGetLanguagesForCountry(value: String => SafeArray[String]): Self = StObject.set(x, "getLanguagesForCountry", js.Any.fromFunction1(value))
      
      inline def setISOCountries(value: SafeArray[String]): Self = StObject.set(x, "ISOCountries", value.asInstanceOf[js.Any])
      
      inline def setISOLanguages(value: SafeArray[String]): Self = StObject.set(x, "ISOLanguages", value.asInstanceOf[js.Any])
      
      inline def setSetDefault(value: Locale => Callback): Self = StObject.set(x, "setDefault", js.Any.fromFunction1((t0: Locale) => value(t0).runNow()))
    }
  }
  
  /**
    * Resource bundles contain locale-specific objects.
    *
    * When your program needs a locale-specific resource, such as `String` for example, your program can load it from the resource bundle that is
    * appropriate for the current user's locale. In this way, you can write program code that is largely independent of the user's locale, which isolates
    * most, if not all, of the locale-specific information in resource bundles.
    *
    * This allows you to write programs that can:
    *
    * be easily localized, or translated, into different languages.
    *
    * handle multiple locales at once.
    *
    * be easily modified, later, to support even more locales.
    *
    *
    *
    * One resource bundle is, conceptually, a set of related services that supports `XResourceBundle` . Each related service of `XResourceBundle` has the
    * same base name plus an additional component that identifies its locale. For example, suppose your resource bundle is named `MyResources` . The first
    * service you are likely to implement is the default resource bundle, which has the same name as its family  - `MyResources` . You can also provide as
    * many related locale-specific services as you need.
    *
    * For example, perhaps you would provide a German one named `MyResources_de` .
    *
    * Each related implementation of `XResourceBundle` contains the same items, but the items have been translated for the locale represented by that
    * `XResourceBundle` implementation. For example, both `MyResources` and `MyResources_de` may have a `String` that is used on a button for confirming
    * operations. In `MyResources` the `String` may contain `OK` and in `MyResources_de` it may contain `Gut` .
    *
    * If there are different resources for different countries, you can make specializations: for example, `MyResources_de_CH` is the German language (de)
    * in Switzerland (CH). If you only want to modify some of the resources in the specialization, you can do so.
    *
    * When your program needs a locale-specific object, it loads
    *
    * the `XResourceBundle` implementation using the {@link XResourceBundleLoader} service:
    *
    * {{program example here, see documentation}}
    *
    *
    *
    * The first argument specifies the family name of the resource bundle that contains the object in question. The second argument indicates the desired
    * locale. `getBundle` uses these two arguments to construct the name of the `ResourceBundle` subclass it should load according to the following
    * specifications.
    *
    * The resource bundle lookup searches for services with various suffixes on the basis of (1) the desired locale and (2) the current default locale as
    * returned by Locale.getDefault(), and (3) the root resource bundle (baseclass), in the following order from lower-level (more specific) to parent-level
    * (less specific):
    *
    * baseclass + "_" + language1 + "_" + country1 + "_" + variant1 ;  baseclass + "_" + language1 + "_" + country1 ;  baseclass + "_" + language1 ;
    * baseclass + "_" + language2 + "_" + country2 + "_" + variant2 ;  baseclass + "_" + language2 + "_" + country2 ;  baseclass + "_" + language2 ;
    * baseclass
    *
    * For example, if the current default locale is `en_US` , the locale that the caller is interested in is `fr_CH` , and the resource bundle name is
    * `MyResources` ; resource bundle lookup will search for the following services, in order: ; `MyResources_fr_CH ;  MyResources_fr ;  MyResources_en_US ;
    *  MyResources_en ;  MyResources`
    *
    * The result of the lookup is a service, but that service may be backed by a property file on disk. If a lookup fails, `getBundle()` throws a
    * `MissingResourceException` .
    *
    * The base service **must** be fully qualified (for example, `myPackage::MyResources` , not just `MyResources` ).
    *
    * Resource bundles contain key/value pairs. The keys uniquely identify a locale-specific object in the bundle. Here is an example of a `XResourceBundle`
    * implementation that contains two key/value pairs:
    *
    * {{program example here, see documentation}}
    *
    *
    *
    * Keys are always `String` s. In this example, the keys are `OkKey` and `CancelKey` . In the above example, the values are also `String` s  - `OK` and
    * `Cancel` -  but they do not have to be. The values can be any type of object.
    *
    * You retrieve an object from resource bundle using the appropriate get method. Because `OkKey` and `CancelKey` are both strings, you use `getByName` to
    * retrieve them:
    *
    * {{program example here, see documentation}}
    *
    *
    *
    * The get methods all require the key as an argument and return the object if found. If the object is not found, the get methods throw a {@link
    * com.sun.star.container.NoSuchElementException} .
    *
    * **NOTE:** You should always supply a base service with no suffixes. This will be the class of "last resort" if a locale is requested that does not
    * exist. In fact, you must provide **all** of the services in any given inheritance chain for which you provide a resource. For example, if you provide
    * `MyResources_fr_BE` , you must provide **both**`MyResources`**and**`MyResources_fr` , or the resource bundle lookup will not work right.
    *
    * You do not have to restrict yourself to using a single family of `ResourceBundle` s. For example, you could have a set of bundles for exception
    * messages, `ExceptionResources` ( `ExceptionResources_fr` , `ExceptionResources_de` , ...), and one for widgets, `WidgetResource` (
    * `WidgetResources_fr` , `WidgetResources_de` , ...); breaking up the resources however you like.
    * @author Mark Davis
    * @author Markus Meyer
    * @deprecated Deprecateddraft
    * @see MissingResourceException
    * @see Locale
    * @version 0.1 26 May 1999
    */
  trait XResourceBundle
    extends StObject
       with XNameAccess {
    
    /** @returns the locale for this resource bundle.  This function can be used to determine whether the resource bundle that is returned really corresponds to t */
    val Locale: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
    
    /**
      * contains the parent bundle of this bundle.
      *
      * The parent bundle is searched by the method {@link com.sun.star.container.XNameAccess.getByName()} when this bundle does not contain a particular
      * resource.
      */
    var Parent: XResourceBundle
    
    /**
      * @param key specifies the element.
      * @returns an object from a resource bundle or NULL if no resource exists.  It does not look in the parents.
      */
    def getDirectElement(key: String): Any
    
    /** @returns the locale for this resource bundle.  This function can be used to determine whether the resource bundle that is returned really corresponds to t */
    def getLocale(): typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
  }
  object XResourceBundle {
    
    inline def apply(
      ElementNames: SafeArray[String],
      ElementType: `type`,
      Locale: Locale,
      Parent: XResourceBundle,
      acquire: Callback,
      getByName: String => Any,
      getDirectElement: String => Any,
      getElementNames: CallbackTo[SafeArray[String]],
      getElementType: CallbackTo[`type`],
      getLocale: CallbackTo[Locale],
      hasByName: String => Boolean,
      hasElements: CallbackTo[Boolean],
      queryInterface: `type` => Any,
      release: Callback
    ): XResourceBundle = {
      val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByName = js.Any.fromFunction1(getByName), getDirectElement = js.Any.fromFunction1(getDirectElement), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, getLocale = getLocale.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XResourceBundle]
    }
    
    extension [Self <: XResourceBundle](x: Self) {
      
      inline def setGetDirectElement(value: String => Any): Self = StObject.set(x, "getDirectElement", js.Any.fromFunction1(value))
      
      inline def setGetLocale(value: CallbackTo[Locale]): Self = StObject.set(x, "getLocale", value.toJsFn)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
      
      inline def setParent(value: XResourceBundle): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * makes it possible to load resource bundles.
    *
    * The search algorithm is specified in the documentation of {@link XResourceBundle} . The implementations must follow the name scheme, but it is allowed
    * to search in several locations.
    * @see MissingResourceException
    * @see XResourceBundle
    * @see Locale
    */
  trait XResourceBundleLoader
    extends StObject
       with XInterface {
    
    /** loads the appropriate resource bundle subclass. */
    def loadBundle(abaseName: String, aLocale: Locale): XResourceBundle
    
    /** loads the appropriate resource bundle. */
    def loadBundle_Default(aBaseName: String): XResourceBundle
  }
  object XResourceBundleLoader {
    
    inline def apply(
      acquire: Callback,
      loadBundle: (String, Locale) => XResourceBundle,
      loadBundle_Default: String => XResourceBundle,
      queryInterface: `type` => Any,
      release: Callback
    ): XResourceBundleLoader = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, loadBundle = js.Any.fromFunction2(loadBundle), loadBundle_Default = js.Any.fromFunction1(loadBundle_Default), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XResourceBundleLoader]
    }
    
    extension [Self <: XResourceBundleLoader](x: Self) {
      
      inline def setLoadBundle(value: (String, Locale) => XResourceBundle): Self = StObject.set(x, "loadBundle", js.Any.fromFunction2(value))
      
      inline def setLoadBundle_Default(value: String => XResourceBundle): Self = StObject.set(x, "loadBundle_Default", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Interface to manage a resource string table containing a set of strings for different locales.
    *
    * The interface is derived from {@link com.sun.star.resource.XStringResourceResolver} that allows to access the string table but not to modify it. This
    * interface also allows to modify the string table.
    *
    * It's designed to be used in the context of creating a string table, e.g. from a string table editor or from a Dialog Editor designing localized
    * dialogs.
    */
  trait XStringResourceManager
    extends StObject
       with XStringResourceResolver {
    
    /**
      * Provides a numeric id that is unique within all Resource IDs used in the string table.
      *
      * This method takes into account all Resource IDs starting with a decimal number and only evaluates the ID until the first non digit character is
      * reached. This allows to extend unique IDs with individual identifiers without breaking the mechanism of this method.
      *
      * Examples: ID "42" -> numeric id 42 ID "0foo" -> numeric id 0 ID "111.MyId.Something.Else" -> numeric id 111 ID "No Digits" -> not considered for
      * numeric id
      *
      * The id returned will be 0 for an empty string table and it will be reset to 0 if all locales are removed. In all other cases this method returns the
      * maximum numeric id used so far at the beginning of a Resource ID incremented by 1. When calling this method more than once always the same number will
      * be returned until this number is really used at the beginning of a new Resource ID passed to {@link setString()} or {@link setStringForLocale()} .
      *
      * As the numeric id is guaranteed to be unique for the complete string table all locales are taken into account. So using this methods will force the
      * implementation to load all locale data that may not have been loaded so far.
      * @throws com::sun::star::lang::NoSupportException if the next available id exceeds the range of type long. So it's not recommended to use own Resource IDs
      */
    val UniqueNumericId: Double
    
    /**
      * Provides a numeric id that is unique within all Resource IDs used in the string table.
      *
      * This method takes into account all Resource IDs starting with a decimal number and only evaluates the ID until the first non digit character is
      * reached. This allows to extend unique IDs with individual identifiers without breaking the mechanism of this method.
      *
      * Examples: ID "42" -> numeric id 42 ID "0foo" -> numeric id 0 ID "111.MyId.Something.Else" -> numeric id 111 ID "No Digits" -> not considered for
      * numeric id
      *
      * The id returned will be 0 for an empty string table and it will be reset to 0 if all locales are removed. In all other cases this method returns the
      * maximum numeric id used so far at the beginning of a Resource ID incremented by 1. When calling this method more than once always the same number will
      * be returned until this number is really used at the beginning of a new Resource ID passed to {@link setString()} or {@link setStringForLocale()} .
      *
      * As the numeric id is guaranteed to be unique for the complete string table all locales are taken into account. So using this methods will force the
      * implementation to load all locale data that may not have been loaded so far.
      * @throws com::sun::star::lang::NoSupportException if the next available id exceeds the range of type long. So it's not recommended to use own Resource IDs
      */
    def getUniqueNumericId(): Double
    
    /**
      * Returns the resource's read only state
      * @returns `TRUE` if the resource is read only, otherwise `FALSE`
      */
    def isReadOnly(): Boolean
    
    /**
      * Creates a new locale.
      *
      * For each existing ResourceID an empty string will be created. The first locale created will automatically be the first default locale. Otherwise
      * strings for all already created IDs will be copied from the default locale.
      * @throws com::sun::star::container::ElementExistException if the Locale already has been created.
      * @throws com::sun::star::lang::IllegalArgumentException if the Locale is not valid.
      * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
      */
    def newLocale(locale: Locale): Unit
    
    /**
      * Removes a Resource ID including the corresponding string for the current locale.
      * @param ResourceID The Resource ID to be removed for the current locale.
      * @throws com::sun::star::resource::MissingResourceException if the Resource ID is not valid.
      * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
      */
    def removeId(ResourceID: String): Unit
    
    /**
      * Removes a Resource ID including the corresponding string for s specific locale.
      * @param ResourceID The Resource ID to be removed.
      * @param locale The locale the Resource ID should be removed for. The locale has to match exactly with one of the locales provided by {@link getLocales()}
      * @throws com::sun::star::resource::MissingResourceException if the Resource ID is not valid.
      * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
      */
    def removeIdForLocale(ResourceID: String, locale: Locale): Unit
    
    /**
      * Removes a locale completely including the corresponding strings for each locale.
      * @throws com::sun::star::lang::IllegalArgumentException if the Locale to be removed is not supported.
      * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
      */
    def removeLocale(locale: Locale): Unit
    
    /**
      * Sets the locale to be used
      * @param Locale Specifies the current locale to be used.
      * @param FindClosestMatch  If true: If the exact locale that should be set is not available the method tries to find the closest match. E.g. if en_US is r
      */
    def setCurrentLocale(Locale: Locale, FindClosestMatch: Boolean): Unit
    
    /**
      * Sets the default locale to be used
      * @param Locale Specifies the default locale to be used. If this locale is not available a {@link com.sun.star.lang.IllegalArgumentException} is thrown.
      * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
      */
    def setDefaultLocale(Locale: Locale): Unit
    
    /**
      * Associates a String to a Resource ID for the current locale. If an entry for the Resource ID already exists, the string associated with it will be
      * overwritten, otherwise a new entry will be created.
      * @param ResourceID ID to address the string inside the resource for the current locale.
      * @param Str String to be associated with the Resource ID.
      * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
      */
    def setString(ResourceID: String, Str: String): Unit
    
    /**
      * Associates a String to a Resource ID for a specific locale. If an entry for the Resource ID already exists, the string associated with it will be
      * overwritten, otherwise a new entry will be created.
      *
      * It's not recommended to use this method to get the best performance as the implementation may be optimized for the use of the current locale.
      * @param ResourceID ID to address the string inside the resource.
      * @param Str String to be associated with the Resource ID.
      * @param locale The locale the string should be set for. The locale has to match exactly with one of the locales provided by {@link getLocales()} . A clos
      * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
      */
    def setStringForLocale(ResourceID: String, Str: String, locale: Locale): Unit
  }
  object XStringResourceManager {
    
    inline def apply(
      CurrentLocale: Locale,
      DefaultLocale: Locale,
      Locales: SafeArray[Locale],
      ResourceIDs: SafeArray[String],
      UniqueNumericId: Double,
      acquire: Callback,
      addModifyListener: XModifyListener => Callback,
      getCurrentLocale: CallbackTo[Locale],
      getDefaultLocale: CallbackTo[Locale],
      getLocales: CallbackTo[SafeArray[Locale]],
      getResourceIDs: CallbackTo[SafeArray[String]],
      getResourceIDsForLocale: Locale => SafeArray[String],
      getUniqueNumericId: CallbackTo[Double],
      hasEntryForId: String => Boolean,
      hasEntryForIdAndLocale: (String, Locale) => Boolean,
      isReadOnly: CallbackTo[Boolean],
      newLocale: Locale => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      removeId: String => Callback,
      removeIdForLocale: (String, Locale) => Callback,
      removeLocale: Locale => Callback,
      removeModifyListener: XModifyListener => Callback,
      resolveString: String => String,
      resolveStringForLocale: (String, Locale) => String,
      setCurrentLocale: (Locale, Boolean) => Callback,
      setDefaultLocale: Locale => Callback,
      setString: (String, String) => Callback,
      setStringForLocale: (String, String, Locale) => Callback
    ): XStringResourceManager = {
      val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale.asInstanceOf[js.Any], DefaultLocale = DefaultLocale.asInstanceOf[js.Any], Locales = Locales.asInstanceOf[js.Any], ResourceIDs = ResourceIDs.asInstanceOf[js.Any], UniqueNumericId = UniqueNumericId.asInstanceOf[js.Any], acquire = acquire.toJsFn, addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), getCurrentLocale = getCurrentLocale.toJsFn, getDefaultLocale = getDefaultLocale.toJsFn, getLocales = getLocales.toJsFn, getResourceIDs = getResourceIDs.toJsFn, getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), getUniqueNumericId = getUniqueNumericId.toJsFn, hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), isReadOnly = isReadOnly.toJsFn, newLocale = js.Any.fromFunction1((t0: Locale) => newLocale(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeId = js.Any.fromFunction1((t0: String) => removeId(t0).runNow()), removeIdForLocale = js.Any.fromFunction2((t0: String, t1: Locale) => (removeIdForLocale(t0, t1)).runNow()), removeLocale = js.Any.fromFunction1((t0: Locale) => removeLocale(t0).runNow()), removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale), setCurrentLocale = js.Any.fromFunction2((t0: Locale, t1: Boolean) => (setCurrentLocale(t0, t1)).runNow()), setDefaultLocale = js.Any.fromFunction1((t0: Locale) => setDefaultLocale(t0).runNow()), setString = js.Any.fromFunction2((t0: String, t1: String) => (setString(t0, t1)).runNow()), setStringForLocale = js.Any.fromFunction3((t0: String, t1: String, t2: Locale) => (setStringForLocale(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[XStringResourceManager]
    }
    
    extension [Self <: XStringResourceManager](x: Self) {
      
      inline def setGetUniqueNumericId(value: CallbackTo[Double]): Self = StObject.set(x, "getUniqueNumericId", value.toJsFn)
      
      inline def setIsReadOnly(value: CallbackTo[Boolean]): Self = StObject.set(x, "isReadOnly", value.toJsFn)
      
      inline def setNewLocale(value: Locale => Callback): Self = StObject.set(x, "newLocale", js.Any.fromFunction1((t0: Locale) => value(t0).runNow()))
      
      inline def setRemoveId(value: String => Callback): Self = StObject.set(x, "removeId", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveIdForLocale(value: (String, Locale) => Callback): Self = StObject.set(x, "removeIdForLocale", js.Any.fromFunction2((t0: String, t1: Locale) => (value(t0, t1)).runNow()))
      
      inline def setRemoveLocale(value: Locale => Callback): Self = StObject.set(x, "removeLocale", js.Any.fromFunction1((t0: Locale) => value(t0).runNow()))
      
      inline def setSetCurrentLocale(value: (Locale, Boolean) => Callback): Self = StObject.set(x, "setCurrentLocale", js.Any.fromFunction2((t0: Locale, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setSetDefaultLocale(value: Locale => Callback): Self = StObject.set(x, "setDefaultLocale", js.Any.fromFunction1((t0: Locale) => value(t0).runNow()))
      
      inline def setSetString(value: (String, String) => Callback): Self = StObject.set(x, "setString", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetStringForLocale(value: (String, String, Locale) => Callback): Self = StObject.set(x, "setStringForLocale", js.Any.fromFunction3((t0: String, t1: String, t2: Locale) => (value(t0, t1, t2)).runNow()))
      
      inline def setUniqueNumericId(value: Double): Self = StObject.set(x, "UniqueNumericId", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Interface derived from {@link XStringResourceManager} containing basic persistence functionality limited to operations that are independent from a
    * associated location or storage.
    * @see XStringResourceManager.
    */
  trait XStringResourcePersistence
    extends StObject
       with XStringResourceManager {
    
    /**
      * Returns a sequence of byte representing the complete string resource in a binary format.
      *
      * This method is intended to support datatransfer functionality, e.g. provided by {@link com.sun.star.datatransfer.XTransferable} and related
      * interfaces.
      *
      * See {@link importBinary()} ).
      * @returns a sequence of byte representing the string resource.
      */
    def exportBinary(): SafeArray[Double]
    
    /**
      * Initializes the string resource with binary data. This method expects the data format returned by {@link exportBinary()} .
      *
      * All locales and strings previously added to the string resource will be deleted. So after calling this method the string resource only contains the
      * locales and strings specified in the binary data.
      *
      * This method is intended to support datatransfer functionality, e.g. provided by {@link com.sun.star.datatransfer.XTransferable} and related
      * interfaces.
      *
      * See {@link importBinary()} ).
      * @throws com::sun::star::lang::IllegalArgumentException if Data is empty or does not meet the binary format returned by the current or earlier version of
      */
    def importBinary(Data: SeqEquiv[Double]): Unit
    
    /**
      * provides the current modify state of the StringResourceManager instance.
      * @returns `TRUE` if the string table has changed since the last call to {@link store()} or, if supported `XStringResourceWithStorage::storeAsStorage` . `FA
      */
    def isModified(): Boolean
    
    /**
      * Sets the comment stored first in each locale data file.
      *
      * This interface method can be used to overwrite the comment used during initialization of the services {@link StringResourceWithLocation} or {@link
      * StringResourceWithStorage}
      * @param Comment Comment stored first in each properties file followed by a line feed character. The line feed character is added automatically and hasn't
      */
    def setComment(Comment: String): Unit
    
    /**
      * Stores all string table data respectively all data modified since the last call to {@link store()} to the location or storage associated with the
      * StringResourceManager. Each locale is stored in a single file following the format of Java properties files.
      *
      * This interface is supported by the services {@link StringResourceWithLocation} and {@link StringResourceWithStorage}
      *
      * The {@link StringResourceWithLocation} is initialized with an URL specifying a location used to load data from and store data to, see {@link
      * StringResourceWithLocation} .
      *
      * The {@link StringResourceWithStorage} is initialized with an instance of {@link com.sun.star.embed.XStorage} used to load data from and store data to,
      * see {@link StringResourceWithStorage} .
      *
      * If the string table isn't modified (see {@link isModified()} ) this method does nothing.
      *
      * This method can throw all exceptions thrown by the methods of {@link com.sun.star.embed.XStorage} respectively a {@link
      * com.sun.star.ucb.CommandAbortedException} in case of a {@link StringResourceWithLocation} for all exceptions that are not handled by a previously
      * specified {@link com.sun.star.task.XInteractionHandler} . The handler to be used for the store operation can be specified during initialization of
      * {@link StringResourceWithLocation} .
      * @throws com::sun::star::lang::NoSupportException if no URL or no valid storage are provided.
      */
    def store(): Unit
    
    /**
      * Stores all string table data to the provided storage.
      *
      * Calling this method does not affect the association with a location (in case of a {@link StringResourceWithLocation} instance) respectively with a
      * storage (in case of a {@link StringResourceWithStorage} instance). The modified state isn't affected either.
      *
      * This method can be used to make a copy of the current string table data to a storage. This method can throw all exceptions thrown by the methods of
      * {@link com.sun.star.embed.XStorage}
      * @param Storage all string table data will be stored to this storage.
      * @param BaseName Base string for the file names used to store the locale data. The locale data is stored in Java properties files also following the corr
      * @param Comment Comment stored first in each properties file, for a detailed description see {@link setComment()} . This method can throw all exceptions
      */
    def storeToStorage(Storage: XStorage, BaseName: String, Comment: String): Unit
    
    /**
      * Stores all string table data to the location specified by the passed URL string.
      *
      * Calling this method does not affect the association with a location (in case of a {@link StringResourceWithLocation} instance) respectively with a
      * storage (in case of a {@link StringResourceWithStorage} instance). The modified state isn't affected either.
      *
      * This method can be used to make a copy of the current string table data to a location.
      * @param URL the location the string table data should be stored to.
      * @param BaseName Base string for the file names used to store the locale data. The locale data is stored in Java properties files also following the corr
      * @param Comment Comment stored first in each properties file, for a detailed description see {@link setComment()} .
      * @param Handler a {@link com.sun.star.task.XInteractionHandler} . It will be passed to ucb handle exceptions. Exceptions not processed by this handler wi
      * @see com.sun.star.task.InteractionHandler
      */
    def storeToURL(URL: String, BaseName: String, Comment: String, Handler: XInteractionHandler): Unit
  }
  object XStringResourcePersistence {
    
    inline def apply(
      CurrentLocale: Locale,
      DefaultLocale: Locale,
      Locales: SafeArray[Locale],
      ResourceIDs: SafeArray[String],
      UniqueNumericId: Double,
      acquire: Callback,
      addModifyListener: XModifyListener => Callback,
      exportBinary: CallbackTo[SafeArray[Double]],
      getCurrentLocale: CallbackTo[Locale],
      getDefaultLocale: CallbackTo[Locale],
      getLocales: CallbackTo[SafeArray[Locale]],
      getResourceIDs: CallbackTo[SafeArray[String]],
      getResourceIDsForLocale: Locale => SafeArray[String],
      getUniqueNumericId: CallbackTo[Double],
      hasEntryForId: String => Boolean,
      hasEntryForIdAndLocale: (String, Locale) => Boolean,
      importBinary: SeqEquiv[Double] => Callback,
      isModified: CallbackTo[Boolean],
      isReadOnly: CallbackTo[Boolean],
      newLocale: Locale => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      removeId: String => Callback,
      removeIdForLocale: (String, Locale) => Callback,
      removeLocale: Locale => Callback,
      removeModifyListener: XModifyListener => Callback,
      resolveString: String => String,
      resolveStringForLocale: (String, Locale) => String,
      setComment: String => Callback,
      setCurrentLocale: (Locale, Boolean) => Callback,
      setDefaultLocale: Locale => Callback,
      setString: (String, String) => Callback,
      setStringForLocale: (String, String, Locale) => Callback,
      store: Callback,
      storeToStorage: (XStorage, String, String) => Callback,
      storeToURL: (String, String, String, XInteractionHandler) => Callback
    ): XStringResourcePersistence = {
      val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale.asInstanceOf[js.Any], DefaultLocale = DefaultLocale.asInstanceOf[js.Any], Locales = Locales.asInstanceOf[js.Any], ResourceIDs = ResourceIDs.asInstanceOf[js.Any], UniqueNumericId = UniqueNumericId.asInstanceOf[js.Any], acquire = acquire.toJsFn, addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), exportBinary = exportBinary.toJsFn, getCurrentLocale = getCurrentLocale.toJsFn, getDefaultLocale = getDefaultLocale.toJsFn, getLocales = getLocales.toJsFn, getResourceIDs = getResourceIDs.toJsFn, getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), getUniqueNumericId = getUniqueNumericId.toJsFn, hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), importBinary = js.Any.fromFunction1((t0: SeqEquiv[Double]) => importBinary(t0).runNow()), isModified = isModified.toJsFn, isReadOnly = isReadOnly.toJsFn, newLocale = js.Any.fromFunction1((t0: Locale) => newLocale(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeId = js.Any.fromFunction1((t0: String) => removeId(t0).runNow()), removeIdForLocale = js.Any.fromFunction2((t0: String, t1: Locale) => (removeIdForLocale(t0, t1)).runNow()), removeLocale = js.Any.fromFunction1((t0: Locale) => removeLocale(t0).runNow()), removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale), setComment = js.Any.fromFunction1((t0: String) => setComment(t0).runNow()), setCurrentLocale = js.Any.fromFunction2((t0: Locale, t1: Boolean) => (setCurrentLocale(t0, t1)).runNow()), setDefaultLocale = js.Any.fromFunction1((t0: Locale) => setDefaultLocale(t0).runNow()), setString = js.Any.fromFunction2((t0: String, t1: String) => (setString(t0, t1)).runNow()), setStringForLocale = js.Any.fromFunction3((t0: String, t1: String, t2: Locale) => (setStringForLocale(t0, t1, t2)).runNow()), store = store.toJsFn, storeToStorage = js.Any.fromFunction3((t0: XStorage, t1: String, t2: String) => (storeToStorage(t0, t1, t2)).runNow()), storeToURL = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: XInteractionHandler) => (storeToURL(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[XStringResourcePersistence]
    }
    
    extension [Self <: XStringResourcePersistence](x: Self) {
      
      inline def setExportBinary(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "exportBinary", value.toJsFn)
      
      inline def setImportBinary(value: SeqEquiv[Double] => Callback): Self = StObject.set(x, "importBinary", js.Any.fromFunction1((t0: SeqEquiv[Double]) => value(t0).runNow()))
      
      inline def setIsModified(value: CallbackTo[Boolean]): Self = StObject.set(x, "isModified", value.toJsFn)
      
      inline def setSetComment(value: String => Callback): Self = StObject.set(x, "setComment", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setStore(value: Callback): Self = StObject.set(x, "store", value.toJsFn)
      
      inline def setStoreToStorage(value: (XStorage, String, String) => Callback): Self = StObject.set(x, "storeToStorage", js.Any.fromFunction3((t0: XStorage, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
      
      inline def setStoreToURL(value: (String, String, String, XInteractionHandler) => Callback): Self = StObject.set(x, "storeToURL", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: XInteractionHandler) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
  
  /**
    * Interface to access strings in a resource.
    *
    * The interface is derived from {@link com.sun.star.util.XModifyBroadcaster}
    *
    * All registered {@link com.sun.star.util.XModifyListener} interfaces will be notified if either the current locale changes or if a string is added,
    * changed or removed. This usually will only happen if the implementing object also supports the interface {@link
    * com.sun.star.resource.XStringResourceManager} and is used in the design mode of a Dialog or String table editor. But also changing the locale at
    * runtime can be supported in this way.
    */
  trait XStringResourceResolver
    extends StObject
       with XModifyBroadcaster {
    
    /**
      * Returns the current locale specified in the accessed resource.
      *
      * If no locale is available, the returned Locale structure only contains empty strings.
      * @returns the used locale
      */
    val CurrentLocale: Locale
    
    /**
      * Returns the default locale of the accessed resource. In many cases this will be the locale of the Office initially used to create the resource.
      * @returns the used locale
      */
    val DefaultLocale: Locale
    
    /**
      * Returns a sequence of all supported locales
      * @returns a sequence of all supported locales
      */
    val Locales: SafeArray[Locale]
    
    /**
      * Returns a sequence of all valid Resource IDs for the current locale
      * @returns a sequence of all valid Resource IDs
      */
    val ResourceIDs: SafeArray[String]
    
    /**
      * Returns the current locale specified in the accessed resource.
      *
      * If no locale is available, the returned Locale structure only contains empty strings.
      * @returns the used locale
      */
    def getCurrentLocale(): Locale
    
    /**
      * Returns the default locale of the accessed resource. In many cases this will be the locale of the Office initially used to create the resource.
      * @returns the used locale
      */
    def getDefaultLocale(): Locale
    
    /**
      * Returns a sequence of all supported locales
      * @returns a sequence of all supported locales
      */
    def getLocales(): SafeArray[Locale]
    
    /**
      * Returns a sequence of all valid Resource IDs for the current locale
      * @returns a sequence of all valid Resource IDs
      */
    def getResourceIDs(): SafeArray[String]
    
    /**
      * Returns a sequence of all valid Resource IDs for a specific locale
      *
      * It's not recommended to use this method to get the best performance as the implementation may be optimized for the use of the current locale.
      * @param locale The locale the ResourceIDs should be returned for. The locale has to match exactly with one of the locales provided by {@link getLocales()
      * @returns a sequence of all valid Resource IDs
      */
    def getResourceIDsForLocale(locale: Locale): SafeArray[String]
    
    /**
      * Checks if the resource contains an entry for the given ResourceID and current locale.
      * @param ResourceID ID to specify the string inside the resource.
      * @returns `TRUE` if an entry exists, otherwise `FALSE`
      */
    def hasEntryForId(ResourceID: String): Boolean
    
    /**
      * Checks if the resource contains an entry for the given ResourceID and locale.
      *
      * It's not recommended to use this method to get the best performance as the implementation may be optimized for the use of the current locale.
      * @param ResourceID ID to specify the string inside the resource.
      * @param locale The locale the entry should be checked for. The locale has to match exactly with one of the locales provided by {@link getLocales()} . A c
      * @returns `TRUE` if an entry exists, otherwise `FALSE`
      */
    def hasEntryForIdAndLocale(ResourceID: String, locale: Locale): Boolean
    
    /**
      * Resolves the passed ResoureID for the current locale. This locale is set during initialization of the object implementing this interface or - in case
      * that also the interface {@link com.sun.star.resource.XStringResourceManager} is supported - by using the `XStringResourceManager::setLocale` method.
      * @param ResourceID ID to specify the string inside the resource. The ID can - but not needs to - be a hierarchical name like "foo.nothing.invalid".
      * @returns the localized string for the specified ID
      * @throws com::sun::star::resource::MissingResourceException if no entry exists for the given ResourceID
      */
    def resolveString(ResourceID: String): String
    
    /**
      * Resolves the passed ResoureID for a specific locale.
      *
      * It's not recommended to use this method to get the best performance as the implementation may be optimized for the use of the current locale.
      * @param ResourceID ID to specify the string inside the resource. The ID can - but not needs to - be a hierarchical name like "foo.nothing.invalid".
      * @param locale The locale the string should be resolved for. The locale has to match exactly with one of the locales provided by {@link getLocales()} . A
      * @returns the localized string for the specified ID and Locale
      * @throws com::sun::star::resource::MissingResourceException if no entry exists for the given ResourceID or locale
      */
    def resolveStringForLocale(ResourceID: String, locale: Locale): String
  }
  object XStringResourceResolver {
    
    inline def apply(
      CurrentLocale: Locale,
      DefaultLocale: Locale,
      Locales: SafeArray[Locale],
      ResourceIDs: SafeArray[String],
      acquire: Callback,
      addModifyListener: XModifyListener => Callback,
      getCurrentLocale: CallbackTo[Locale],
      getDefaultLocale: CallbackTo[Locale],
      getLocales: CallbackTo[SafeArray[Locale]],
      getResourceIDs: CallbackTo[SafeArray[String]],
      getResourceIDsForLocale: Locale => SafeArray[String],
      hasEntryForId: String => Boolean,
      hasEntryForIdAndLocale: (String, Locale) => Boolean,
      queryInterface: `type` => Any,
      release: Callback,
      removeModifyListener: XModifyListener => Callback,
      resolveString: String => String,
      resolveStringForLocale: (String, Locale) => String
    ): XStringResourceResolver = {
      val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale.asInstanceOf[js.Any], DefaultLocale = DefaultLocale.asInstanceOf[js.Any], Locales = Locales.asInstanceOf[js.Any], ResourceIDs = ResourceIDs.asInstanceOf[js.Any], acquire = acquire.toJsFn, addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), getCurrentLocale = getCurrentLocale.toJsFn, getDefaultLocale = getDefaultLocale.toJsFn, getLocales = getLocales.toJsFn, getResourceIDs = getResourceIDs.toJsFn, getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale))
      __obj.asInstanceOf[XStringResourceResolver]
    }
    
    extension [Self <: XStringResourceResolver](x: Self) {
      
      inline def setCurrentLocale(value: Locale): Self = StObject.set(x, "CurrentLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocale(value: Locale): Self = StObject.set(x, "DefaultLocale", value.asInstanceOf[js.Any])
      
      inline def setGetCurrentLocale(value: CallbackTo[Locale]): Self = StObject.set(x, "getCurrentLocale", value.toJsFn)
      
      inline def setGetDefaultLocale(value: CallbackTo[Locale]): Self = StObject.set(x, "getDefaultLocale", value.toJsFn)
      
      inline def setGetLocales(value: CallbackTo[SafeArray[Locale]]): Self = StObject.set(x, "getLocales", value.toJsFn)
      
      inline def setGetResourceIDs(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getResourceIDs", value.toJsFn)
      
      inline def setGetResourceIDsForLocale(value: Locale => SafeArray[String]): Self = StObject.set(x, "getResourceIDsForLocale", js.Any.fromFunction1(value))
      
      inline def setHasEntryForId(value: String => Boolean): Self = StObject.set(x, "hasEntryForId", js.Any.fromFunction1(value))
      
      inline def setHasEntryForIdAndLocale(value: (String, Locale) => Boolean): Self = StObject.set(x, "hasEntryForIdAndLocale", js.Any.fromFunction2(value))
      
      inline def setLocales(value: SafeArray[Locale]): Self = StObject.set(x, "Locales", value.asInstanceOf[js.Any])
      
      inline def setResolveString(value: String => String): Self = StObject.set(x, "resolveString", js.Any.fromFunction1(value))
      
      inline def setResolveStringForLocale(value: (String, Locale) => String): Self = StObject.set(x, "resolveStringForLocale", js.Any.fromFunction2(value))
      
      inline def setResourceIDs(value: SafeArray[String]): Self = StObject.set(x, "ResourceIDs", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides access to a string resource represented by a {@link com.sun.star.resource.XStringResourceResolver} . */
  trait XStringResourceSupplier
    extends StObject
       with XInterface {
    
    /**
      * Provides access to a string resource. Depending on the context the returned object may also support {@link
      * com.sun.star.resource.XStringResourceManager} or {@link com.sun.star.resource.XStringResourcePersistence} or {@link
      * com.sun.star.resource.XStringResourceWithStorage}
      * @returns an interface {@link com.sun.star.resource.XStringResourceResolver}
      */
    val StringResource: XStringResourceResolver
    
    /**
      * Provides access to a string resource. Depending on the context the returned object may also support {@link
      * com.sun.star.resource.XStringResourceManager} or {@link com.sun.star.resource.XStringResourcePersistence} or {@link
      * com.sun.star.resource.XStringResourceWithStorage}
      * @returns an interface {@link com.sun.star.resource.XStringResourceResolver}
      */
    def getStringResource(): XStringResourceResolver
  }
  object XStringResourceSupplier {
    
    inline def apply(
      StringResource: XStringResourceResolver,
      acquire: Callback,
      getStringResource: CallbackTo[XStringResourceResolver],
      queryInterface: `type` => Any,
      release: Callback
    ): XStringResourceSupplier = {
      val __obj = js.Dynamic.literal(StringResource = StringResource.asInstanceOf[js.Any], acquire = acquire.toJsFn, getStringResource = getStringResource.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XStringResourceSupplier]
    }
    
    extension [Self <: XStringResourceSupplier](x: Self) {
      
      inline def setGetStringResource(value: CallbackTo[XStringResourceResolver]): Self = StObject.set(x, "getStringResource", value.toJsFn)
      
      inline def setStringResource(value: XStringResourceResolver): Self = StObject.set(x, "StringResource", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Extends {@link XStringResourcePersistence} by methods to handle an associated location.
    * @see XStringResourcePersistence.
    */
  trait XStringResourceWithLocation
    extends StObject
       with XStringResourcePersistence {
    
    /**
      * Associates a location to the {@link StringResourceWithStorage} instance which is used on subsequent calls of {@link store()} .
      * @param URL the location to be associated to the StringResourceManager  This call has to be used carefully as it removes the location previously connecte
      * @throws com::sun::star::lang::IllegalArgumentException if an empty string is passed as URL
      * @throws com::sun::star::lang::NoSupportException if the location is readonly
      */
    def setURL(URL: String): Unit
    
    /**
      * Stores all string table data to a location and associates this location to this instance as if setLocation() was called with this location. The
      * modified state will be unmodified after the call.
      * @param URL the location the string table data should be stored to.
      */
    def storeAsURL(URL: String): Unit
  }
  object XStringResourceWithLocation {
    
    inline def apply(
      CurrentLocale: Locale,
      DefaultLocale: Locale,
      Locales: SafeArray[Locale],
      ResourceIDs: SafeArray[String],
      UniqueNumericId: Double,
      acquire: Callback,
      addModifyListener: XModifyListener => Callback,
      exportBinary: CallbackTo[SafeArray[Double]],
      getCurrentLocale: CallbackTo[Locale],
      getDefaultLocale: CallbackTo[Locale],
      getLocales: CallbackTo[SafeArray[Locale]],
      getResourceIDs: CallbackTo[SafeArray[String]],
      getResourceIDsForLocale: Locale => SafeArray[String],
      getUniqueNumericId: CallbackTo[Double],
      hasEntryForId: String => Boolean,
      hasEntryForIdAndLocale: (String, Locale) => Boolean,
      importBinary: SeqEquiv[Double] => Callback,
      isModified: CallbackTo[Boolean],
      isReadOnly: CallbackTo[Boolean],
      newLocale: Locale => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      removeId: String => Callback,
      removeIdForLocale: (String, Locale) => Callback,
      removeLocale: Locale => Callback,
      removeModifyListener: XModifyListener => Callback,
      resolveString: String => String,
      resolveStringForLocale: (String, Locale) => String,
      setComment: String => Callback,
      setCurrentLocale: (Locale, Boolean) => Callback,
      setDefaultLocale: Locale => Callback,
      setString: (String, String) => Callback,
      setStringForLocale: (String, String, Locale) => Callback,
      setURL: String => Callback,
      store: Callback,
      storeAsURL: String => Callback,
      storeToStorage: (XStorage, String, String) => Callback,
      storeToURL: (String, String, String, XInteractionHandler) => Callback
    ): XStringResourceWithLocation = {
      val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale.asInstanceOf[js.Any], DefaultLocale = DefaultLocale.asInstanceOf[js.Any], Locales = Locales.asInstanceOf[js.Any], ResourceIDs = ResourceIDs.asInstanceOf[js.Any], UniqueNumericId = UniqueNumericId.asInstanceOf[js.Any], acquire = acquire.toJsFn, addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), exportBinary = exportBinary.toJsFn, getCurrentLocale = getCurrentLocale.toJsFn, getDefaultLocale = getDefaultLocale.toJsFn, getLocales = getLocales.toJsFn, getResourceIDs = getResourceIDs.toJsFn, getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), getUniqueNumericId = getUniqueNumericId.toJsFn, hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), importBinary = js.Any.fromFunction1((t0: SeqEquiv[Double]) => importBinary(t0).runNow()), isModified = isModified.toJsFn, isReadOnly = isReadOnly.toJsFn, newLocale = js.Any.fromFunction1((t0: Locale) => newLocale(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeId = js.Any.fromFunction1((t0: String) => removeId(t0).runNow()), removeIdForLocale = js.Any.fromFunction2((t0: String, t1: Locale) => (removeIdForLocale(t0, t1)).runNow()), removeLocale = js.Any.fromFunction1((t0: Locale) => removeLocale(t0).runNow()), removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale), setComment = js.Any.fromFunction1((t0: String) => setComment(t0).runNow()), setCurrentLocale = js.Any.fromFunction2((t0: Locale, t1: Boolean) => (setCurrentLocale(t0, t1)).runNow()), setDefaultLocale = js.Any.fromFunction1((t0: Locale) => setDefaultLocale(t0).runNow()), setString = js.Any.fromFunction2((t0: String, t1: String) => (setString(t0, t1)).runNow()), setStringForLocale = js.Any.fromFunction3((t0: String, t1: String, t2: Locale) => (setStringForLocale(t0, t1, t2)).runNow()), setURL = js.Any.fromFunction1((t0: String) => setURL(t0).runNow()), store = store.toJsFn, storeAsURL = js.Any.fromFunction1((t0: String) => storeAsURL(t0).runNow()), storeToStorage = js.Any.fromFunction3((t0: XStorage, t1: String, t2: String) => (storeToStorage(t0, t1, t2)).runNow()), storeToURL = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: XInteractionHandler) => (storeToURL(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[XStringResourceWithLocation]
    }
    
    extension [Self <: XStringResourceWithLocation](x: Self) {
      
      inline def setSetURL(value: String => Callback): Self = StObject.set(x, "setURL", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setStoreAsURL(value: String => Callback): Self = StObject.set(x, "storeAsURL", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  /**
    * Extends {@link XStringResourcePersistence} by methods to handle an associated {@link com.sun.star.embed.XStorage} instance.
    * @see XStringResourcePersistence.
    */
  trait XStringResourceWithStorage
    extends StObject
       with XStringResourcePersistence {
    
    /**
      * Associates a storage to the {@link StringResourceWithStorage} instance which is used on subsequent calls of {@link store()} .
      * @param Storage the storage to be associated to the StringResourceManager  This call has to be used carefully as it removes the storage previously connec
      * @throws com::sun::star::lang::IllegalArgumentException if a null interface is passed as Storage
      */
    def setStorage(Storage: XStorage): Unit
    
    /**
      * Stores all string table data to a storage and associates this storage to this instance as if {@link setStorage()} was called with this storage. The
      * modified state will be unmodified after the call.
      *
      * This method can throw all exceptions thrown by the methods of {@link com.sun.star.embed.XStorage}
      */
    def storeAsStorage(Storage: XStorage): Unit
  }
  object XStringResourceWithStorage {
    
    inline def apply(
      CurrentLocale: Locale,
      DefaultLocale: Locale,
      Locales: SafeArray[Locale],
      ResourceIDs: SafeArray[String],
      UniqueNumericId: Double,
      acquire: Callback,
      addModifyListener: XModifyListener => Callback,
      exportBinary: CallbackTo[SafeArray[Double]],
      getCurrentLocale: CallbackTo[Locale],
      getDefaultLocale: CallbackTo[Locale],
      getLocales: CallbackTo[SafeArray[Locale]],
      getResourceIDs: CallbackTo[SafeArray[String]],
      getResourceIDsForLocale: Locale => SafeArray[String],
      getUniqueNumericId: CallbackTo[Double],
      hasEntryForId: String => Boolean,
      hasEntryForIdAndLocale: (String, Locale) => Boolean,
      importBinary: SeqEquiv[Double] => Callback,
      isModified: CallbackTo[Boolean],
      isReadOnly: CallbackTo[Boolean],
      newLocale: Locale => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      removeId: String => Callback,
      removeIdForLocale: (String, Locale) => Callback,
      removeLocale: Locale => Callback,
      removeModifyListener: XModifyListener => Callback,
      resolveString: String => String,
      resolveStringForLocale: (String, Locale) => String,
      setComment: String => Callback,
      setCurrentLocale: (Locale, Boolean) => Callback,
      setDefaultLocale: Locale => Callback,
      setStorage: XStorage => Callback,
      setString: (String, String) => Callback,
      setStringForLocale: (String, String, Locale) => Callback,
      store: Callback,
      storeAsStorage: XStorage => Callback,
      storeToStorage: (XStorage, String, String) => Callback,
      storeToURL: (String, String, String, XInteractionHandler) => Callback
    ): XStringResourceWithStorage = {
      val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale.asInstanceOf[js.Any], DefaultLocale = DefaultLocale.asInstanceOf[js.Any], Locales = Locales.asInstanceOf[js.Any], ResourceIDs = ResourceIDs.asInstanceOf[js.Any], UniqueNumericId = UniqueNumericId.asInstanceOf[js.Any], acquire = acquire.toJsFn, addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), exportBinary = exportBinary.toJsFn, getCurrentLocale = getCurrentLocale.toJsFn, getDefaultLocale = getDefaultLocale.toJsFn, getLocales = getLocales.toJsFn, getResourceIDs = getResourceIDs.toJsFn, getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), getUniqueNumericId = getUniqueNumericId.toJsFn, hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), importBinary = js.Any.fromFunction1((t0: SeqEquiv[Double]) => importBinary(t0).runNow()), isModified = isModified.toJsFn, isReadOnly = isReadOnly.toJsFn, newLocale = js.Any.fromFunction1((t0: Locale) => newLocale(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeId = js.Any.fromFunction1((t0: String) => removeId(t0).runNow()), removeIdForLocale = js.Any.fromFunction2((t0: String, t1: Locale) => (removeIdForLocale(t0, t1)).runNow()), removeLocale = js.Any.fromFunction1((t0: Locale) => removeLocale(t0).runNow()), removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale), setComment = js.Any.fromFunction1((t0: String) => setComment(t0).runNow()), setCurrentLocale = js.Any.fromFunction2((t0: Locale, t1: Boolean) => (setCurrentLocale(t0, t1)).runNow()), setDefaultLocale = js.Any.fromFunction1((t0: Locale) => setDefaultLocale(t0).runNow()), setStorage = js.Any.fromFunction1((t0: XStorage) => setStorage(t0).runNow()), setString = js.Any.fromFunction2((t0: String, t1: String) => (setString(t0, t1)).runNow()), setStringForLocale = js.Any.fromFunction3((t0: String, t1: String, t2: Locale) => (setStringForLocale(t0, t1, t2)).runNow()), store = store.toJsFn, storeAsStorage = js.Any.fromFunction1((t0: XStorage) => storeAsStorage(t0).runNow()), storeToStorage = js.Any.fromFunction3((t0: XStorage, t1: String, t2: String) => (storeToStorage(t0, t1, t2)).runNow()), storeToURL = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: XInteractionHandler) => (storeToURL(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[XStringResourceWithStorage]
    }
    
    extension [Self <: XStringResourceWithStorage](x: Self) {
      
      inline def setSetStorage(value: XStorage => Callback): Self = StObject.set(x, "setStorage", js.Any.fromFunction1((t0: XStorage) => value(t0).runNow()))
      
      inline def setStoreAsStorage(value: XStorage => Callback): Self = StObject.set(x, "storeAsStorage", js.Any.fromFunction1((t0: XStorage) => value(t0).runNow()))
    }
  }
}
