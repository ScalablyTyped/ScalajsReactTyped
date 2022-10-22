package typingsJapgolly.dmgLicense

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dmgLicense.anon.CreateOptionsincludeLangu
import typingsJapgolly.dmgLicense.anon.CreateOptionsincludeLanguIncludeLanguageName
import typingsJapgolly.dmgLicense.anon.Data
import typingsJapgolly.dmgLicense.anon.OnNoLanguageName
import typingsJapgolly.dmgLicense.anon.Plist
import typingsJapgolly.dmgLicense.anon.`0`
import typingsJapgolly.dmgLicense.anon.`1`
import typingsJapgolly.dmgLicense.dmgLicenseStrings.agree
import typingsJapgolly.dmgLicense.dmgLicenseStrings.disagree
import typingsJapgolly.dmgLicense.dmgLicenseStrings.languageName
import typingsJapgolly.dmgLicense.dmgLicenseStrings.message
import typingsJapgolly.dmgLicense.dmgLicenseStrings.print
import typingsJapgolly.dmgLicense.dmgLicenseStrings.save
import typingsJapgolly.dmgLicense.libBodySpecMod.BodySpec
import typingsJapgolly.dmgLicense.libLabelsMod.Labels.CreateOptions
import typingsJapgolly.dmgLicense.libLabelsMod.Labels.ForEachOptions
import typingsJapgolly.dmgLicense.libLabelsMod.Labels.MapOptions
import typingsJapgolly.dmgLicense.libLabelsMod.Labels.WithLanguageName
import typingsJapgolly.dmgLicense.libLabelsMod.Labels.WithoutLanguageName
import typingsJapgolly.dmgLicense.libLabelsMod.LabelsSpec
import typingsJapgolly.dmgLicense.libLabelsMod.LabelsSpec.LabelsInline
import typingsJapgolly.dmgLicense.libLabelsMod.LabelsSpec.LabelsRaw
import typingsJapgolly.dmgLicense.libLanguageMod.LangSpec
import typingsJapgolly.dmgLicense.libLanguageMod.LangSpecs
import typingsJapgolly.dmgLicense.libLanguageMod.default
import typingsJapgolly.dmgLicense.libSpecFromJSONMod.FromJSONOptions
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dmg-license", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(imagePath: String, spec: LicenseSpec, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(imagePath.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("dmg-license", "BadJSONLicenseSpecError")
  @js.native
  open class BadJSONLicenseSpecError protected ()
    extends typingsJapgolly.dmgLicense.libSpecFromJSONMod.BadJSONLicenseSpecError {
    def this(message: String, params: Any*) = this()
    def this(message: Unit, params: Any*) = this()
    def this(options: js.Error, message: String, params: Any*) = this()
    def this(options: typingsJapgolly.verror.mod.Options, message: String, params: Any*) = this()
  }
  
  object BodySpec {
    
    @JSImport("dmg-license", "BodySpec")
    @js.native
    val ^ : js.Any = js.native
    
    inline def prepare(spec: typingsJapgolly.dmgLicense.libBodySpecMod.BodySpec, lang: default): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(spec.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
    inline def prepare(
      spec: typingsJapgolly.dmgLicense.libBodySpecMod.BodySpec,
      lang: default,
      contextOrOptions: typingsJapgolly.dmgLicense.libContextMod.default
    ): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(spec.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
    inline def prepare(spec: typingsJapgolly.dmgLicense.libBodySpecMod.BodySpec, lang: default, contextOrOptions: Options): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(spec.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
  }
  
  @JSImport("dmg-license", "LabelEncodingError")
  @js.native
  open class LabelEncodingError protected ()
    extends typingsJapgolly.dmgLicense.libLabelsMod.LabelEncodingError {
    def this(labelDescription: String, lang: default, cause: String, params: Any*) = this()
    def this(labelDescription: String, lang: default, cause: js.Error, params: Any*) = this()
    def this(labelDescription: String, lang: default, cause: Unit, params: Any*) = this()
  }
  
  object Labels {
    
    @JSImport("dmg-license", "Labels")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          T
        ]
    ): typingsJapgolly.dmgLicense.libLabelsMod.Labels[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(fun.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dmgLicense.libLabelsMod.Labels[T]]
    inline def create[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          T
        ],
      options: CreateOptionsincludeLangu
    ): WithLanguageName[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WithLanguageName[T]]
    inline def create[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          T
        ],
      options: CreateOptionsincludeLanguIncludeLanguageName
    ): WithoutLanguageName[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WithoutLanguageName[T]]
    inline def create[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          T
        ],
      options: CreateOptions
    ): typingsJapgolly.dmgLicense.libLabelsMod.Labels[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dmgLicense.libLabelsMod.Labels[T]]
    
    inline def createAsync[T](
      fun: js.Function2[
          agree | disagree | languageName | message | print | save, 
          /* index */ Double, 
          js.Promise[T]
        ]
    ): js.Promise[WithoutLanguageName[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(fun.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WithoutLanguageName[T]]]
    inline def createAsync[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          js.Promise[T]
        ],
      options: CreateOptionsincludeLangu
    ): js.Promise[WithLanguageName[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithLanguageName[T]]]
    inline def createAsync[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          js.Promise[T]
        ],
      options: CreateOptionsincludeLanguIncludeLanguageName
    ): js.Promise[WithoutLanguageName[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithoutLanguageName[T]]]
    inline def createAsync[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          js.Promise[T]
        ],
      options: CreateOptions
    ): js.Promise[typingsJapgolly.dmgLicense.libLabelsMod.Labels[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.dmgLicense.libLabelsMod.Labels[T]]]
    
    inline def create_T_WithoutLanguageName[T](
      fun: js.Function2[
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* index */ Double, 
          T
        ]
    ): WithoutLanguageName[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(fun.asInstanceOf[js.Any]).asInstanceOf[WithoutLanguageName[T]]
    
    /* Inlined std.Readonly<{  languageName :string,   agree :string,   disagree :string,   print :string,   save :string,   message :string}> */
    object descriptions {
      
      @JSImport("dmg-license", "Labels.descriptions.agree")
      @js.native
      val agree: String = js.native
      
      @JSImport("dmg-license", "Labels.descriptions.disagree")
      @js.native
      val disagree: String = js.native
      
      @JSImport("dmg-license", "Labels.descriptions.languageName")
      @js.native
      val languageName: String = js.native
      
      @JSImport("dmg-license", "Labels.descriptions.message")
      @js.native
      val message: String = js.native
      
      @JSImport("dmg-license", "Labels.descriptions.print")
      @js.native
      val print: String = js.native
      
      @JSImport("dmg-license", "Labels.descriptions.save")
      @js.native
      val save: String = js.native
    }
    
    inline def forEach[T](
      labels: typingsJapgolly.dmgLicense.libLabelsMod.Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ typingsJapgolly.dmgLicense.libLabelsMod.Labels[T], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def forEach[T](
      labels: typingsJapgolly.dmgLicense.libLabelsMod.Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ typingsJapgolly.dmgLicense.libLabelsMod.Labels[T], 
          Unit
        ],
      hasOnNoLanguageName: ForEachOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], hasOnNoLanguageName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def fromPromises[T](labels: typingsJapgolly.dmgLicense.libLabelsMod.Labels[js.Promise[T]]): js.Promise[typingsJapgolly.dmgLicense.libLabelsMod.Labels[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromises")(labels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.dmgLicense.libLabelsMod.Labels[T]]]
    inline def fromPromises[T](labels: WithLanguageName[js.Promise[T]]): js.Promise[WithLanguageName[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromises")(labels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WithLanguageName[T]]]
    inline def fromPromises[T](labels: WithoutLanguageName[js.Promise[T]]): js.Promise[WithoutLanguageName[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromises")(labels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WithoutLanguageName[T]]]
    
    inline def map[T, U](
      labels: WithLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ typingsJapgolly.dmgLicense.libLabelsMod.Labels[T], 
          U
        ]
    ): WithLanguageName[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[WithLanguageName[U]]
    inline def map[T, U](
      labels: WithLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ typingsJapgolly.dmgLicense.libLabelsMod.Labels[T], 
          U
        ],
      options: MapOptions[T, U]
    ): WithLanguageName[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WithLanguageName[U]]
    inline def map[T, U](
      labels: WithoutLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ typingsJapgolly.dmgLicense.libLabelsMod.Labels[T], 
          U
        ]
    ): WithoutLanguageName[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[WithoutLanguageName[U]]
    inline def map[T, U](
      labels: WithoutLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ typingsJapgolly.dmgLicense.libLabelsMod.Labels[T], 
          U
        ],
      options: (MapOptions[T, U]) & OnNoLanguageName
    ): WithoutLanguageName[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WithoutLanguageName[U]]
    inline def map[T, U](
      labels: typingsJapgolly.dmgLicense.libLabelsMod.Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ typingsJapgolly.dmgLicense.libLabelsMod.Labels[T], 
          U
        ]
    ): typingsJapgolly.dmgLicense.libLabelsMod.Labels[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dmgLicense.libLabelsMod.Labels[U]]
    inline def map[T, U](
      labels: typingsJapgolly.dmgLicense.libLabelsMod.Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ typingsJapgolly.dmgLicense.libLabelsMod.Labels[T], 
          U
        ],
      options: (MapOptions[T, U]) & `1`[U]
    ): WithLanguageName[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WithLanguageName[U]]
    inline def map[T, U](
      labels: typingsJapgolly.dmgLicense.libLabelsMod.Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ typingsJapgolly.dmgLicense.libLabelsMod.Labels[T], 
          U
        ],
      options: MapOptions[T, U]
    ): typingsJapgolly.dmgLicense.libLabelsMod.Labels[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dmgLicense.libLabelsMod.Labels[U]]
    
    inline def mapAsync[T, U](
      labels: WithLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ typingsJapgolly.dmgLicense.libLabelsMod.Labels[T], 
          js.Promise[U]
        ]
    ): js.Promise[WithLanguageName[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithLanguageName[U]]]
    inline def mapAsync[T, U](
      labels: WithLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ typingsJapgolly.dmgLicense.libLabelsMod.Labels[T], 
          js.Promise[U]
        ],
      options: MapOptions[T, js.Promise[U]]
    ): js.Promise[WithLanguageName[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithLanguageName[U]]]
    inline def mapAsync[T, U](
      labels: WithoutLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ typingsJapgolly.dmgLicense.libLabelsMod.Labels[T], 
          js.Promise[U]
        ]
    ): js.Promise[WithoutLanguageName[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithoutLanguageName[U]]]
    inline def mapAsync[T, U](
      labels: WithoutLanguageName[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ typingsJapgolly.dmgLicense.libLabelsMod.Labels[T], 
          js.Promise[U]
        ],
      options: (MapOptions[T, js.Promise[U]]) & OnNoLanguageName
    ): js.Promise[WithoutLanguageName[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithoutLanguageName[U]]]
    inline def mapAsync[T, U](
      labels: typingsJapgolly.dmgLicense.libLabelsMod.Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ typingsJapgolly.dmgLicense.libLabelsMod.Labels[T], 
          js.Promise[U]
        ]
    ): js.Promise[typingsJapgolly.dmgLicense.libLabelsMod.Labels[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.dmgLicense.libLabelsMod.Labels[U]]]
    inline def mapAsync[T, U](
      labels: typingsJapgolly.dmgLicense.libLabelsMod.Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ typingsJapgolly.dmgLicense.libLabelsMod.Labels[T], 
          js.Promise[U]
        ],
      options: (MapOptions[T, js.Promise[U]]) & `0`[U]
    ): js.Promise[WithLanguageName[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithLanguageName[U]]]
    inline def mapAsync[T, U](
      labels: typingsJapgolly.dmgLicense.libLabelsMod.Labels[T],
      fun: js.Function3[
          /* label */ T, 
          /* keyof dmg-license.dmg-license/lib/Labels.Labels<string> */ /* key */ languageName | agree | disagree | print | save | message, 
          /* labels */ typingsJapgolly.dmgLicense.libLabelsMod.Labels[T], 
          js.Promise[U]
        ],
      options: MapOptions[T, js.Promise[U]]
    ): js.Promise[typingsJapgolly.dmgLicense.libLabelsMod.Labels[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(labels.asInstanceOf[js.Any], fun.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.dmgLicense.libLabelsMod.Labels[U]]]
    
    @JSImport("dmg-license", "Labels.names")
    @js.native
    val names: js.Array[message | languageName | agree | disagree | print | save] = js.native
    
    /**
      * Prepares a label set for insertion into a disk image as a `STR#` resource.
      *
      * @remarks
      * Throws {@link LabelEncodingError} if there is a problem encoding some of the labels.
      *
      * Throws {@link verror#MultiError} if there is more than one error.
      *
      * @param labels - The label set to prepare.
      *
      * @param lang - The language to prepare the label set for. This determines the target character set.
      *
      * @returns A `Buffer` in `STR#` format.
      */
    inline def prepare(labels: typingsJapgolly.dmgLicense.libLabelsMod.Labels[String], lang: default): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    /**
      * Prepares the given language's default label set for insertion into a disk image as a `STR#` resource.
      *
      * @remarks
      * Throws {@link NoDefaultLabelsError} if there is no default label set for the given language.
      *
      * Throws {@link LabelEncodingError} if there is a problem encoding some of the labels.
      *
      * Throws a {@link verror#MultiError} if there is more than one error.
      *
      * @param lang - The language to prepare the label set for.
      *
      * @param contextOrOptions - Context of an existing {@link dmgLicense} run, or options for one (when calling this function standalone).
      *
      * @returns A `Buffer` in `STR#` format.
      */
    inline def prepareDefault(lang: default): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareDefault")(lang.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def prepareSpec(labels: Null, lang: default, contextOrOptions: typingsJapgolly.dmgLicense.libContextMod.default): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSpec")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def prepareSpec(labels: Null, lang: default, contextOrOptions: Options): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSpec")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def prepareSpec(labels: Unit, lang: default, contextOrOptions: typingsJapgolly.dmgLicense.libContextMod.default): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSpec")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def prepareSpec(labels: Unit, lang: default, contextOrOptions: Options): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSpec")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    /**
      * Prepares a label set for insertion into a disk image as a `STR#` resource.
      *
      * @remarks
      * This function delegates to `prepareDefault` or `prepare` as appropriate.
      *
      * Throws {@link NoDefaultLabelsError} if `labels` is `null` or `undefined` and there is no default label set for the given language.
      *
      * Throws {@link LabelEncodingError} if there is a problem encoding some of the labels.
      *
      * Throws a {@link verror#MultiError} if there is more than one error.
      *
      * @param labels - An object describing the label set to prepare. If `null` or `undefined`, the default label set for the given language is used instead.
      *
      * @param lang - The language to prepare the label set for. This determines the target character set, and if `labels` is `null` or `undefined`, which language's default label set to use.
      *
      * @param contextOrOptions - Context of an existing {@link dmgLicense} run, or options for one (when calling this function standalone). Used to resolve relative paths if `labels` is a `LabelsSpec.LabelsRaw`.
      *
      * @returns A `Buffer` in `STR#` format.
      */
    inline def prepareSpec(
      labels: LabelsSpec,
      lang: default,
      contextOrOptions: typingsJapgolly.dmgLicense.libContextMod.default
    ): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSpec")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def prepareSpec(labels: LabelsSpec, lang: default, contextOrOptions: Options): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSpec")(labels.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  }
  
  /* note: abstract class */ @JSImport("dmg-license", "Language")
  @js.native
  open class Language ()
    extends typingsJapgolly.dmgLicense.libLanguageMod.Language
  /* static members */
  object Language {
    
    @JSImport("dmg-license", "Language")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(lang: typingsJapgolly.dmgLicense.libLanguageMod.Language): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(lang.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("dmg-license", "Language.byID")
    @js.native
    def byID: js.Array[js.UndefOr[typingsJapgolly.dmgLicense.libLanguageMod.Language]] = js.native
    inline def byID_=(x: js.Array[js.UndefOr[typingsJapgolly.dmgLicense.libLanguageMod.Language]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byID")(x.asInstanceOf[js.Any])
    
    inline def bySpec(lang: LangSpecs): js.Array[typingsJapgolly.dmgLicense.libLanguageMod.Language] = ^.asInstanceOf[js.Dynamic].applyDynamic("bySpec")(lang.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.dmgLicense.libLanguageMod.Language]]
    inline def bySpec(lang: LangSpecs, context: typingsJapgolly.dmgLicense.libContextMod.default): js.Array[typingsJapgolly.dmgLicense.libLanguageMod.Language] = (^.asInstanceOf[js.Dynamic].applyDynamic("bySpec")(lang.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.dmgLicense.libLanguageMod.Language]]
    
    @JSImport("dmg-license", "Language.byTag")
    @js.native
    def byTag: StringDictionary[js.UndefOr[typingsJapgolly.dmgLicense.libLanguageMod.Language]] = js.native
    inline def byTag_=(x: StringDictionary[js.UndefOr[typingsJapgolly.dmgLicense.libLanguageMod.Language]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byTag")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("dmg-license", "NoDefaultLabelsError")
  @js.native
  open class NoDefaultLabelsError protected ()
    extends typingsJapgolly.dmgLicense.libLabelsMod.NoDefaultLabelsError {
    def this(lang: default) = this()
    def this(lang: default, message: String) = this()
  }
  
  inline def dmgLicense(imagePath: String, spec: LicenseSpec, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dmgLicense")(imagePath.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def dmgLicenseFromJSON(imagePath: String, specJSON: String, options: FromJSONOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dmgLicenseFromJSON")(imagePath.asInstanceOf[js.Any], specJSON.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dmgLicenseFromJSON(imagePath: String, specJSON: js.Object, options: FromJSONOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dmgLicenseFromJSON")(imagePath.asInstanceOf[js.Any], specJSON.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def dmgLicensePlist(spec: LicenseSpec, options: Options): js.Promise[Plist] = (^.asInstanceOf[js.Dynamic].applyDynamic("dmgLicensePlist")(spec.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Plist]]
  
  inline def dmgLicensePlistFromJSON(specJSON: String, options: FromJSONOptions): js.Promise[Plist] = (^.asInstanceOf[js.Dynamic].applyDynamic("dmgLicensePlistFromJSON")(specJSON.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Plist]]
  inline def dmgLicensePlistFromJSON(specJSON: js.Object, options: FromJSONOptions): js.Promise[Plist] = (^.asInstanceOf[js.Dynamic].applyDynamic("dmgLicensePlistFromJSON")(specJSON.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Plist]]
  
  trait LicenseSpec extends StObject {
    
    var body: js.Array[BodySpec]
    
    var defaultLang: js.UndefOr[LangSpec] = js.undefined
    
    var labels: js.UndefOr[js.Array[LabelsInline]] = js.undefined
    
    var rawLabels: js.UndefOr[js.Array[LabelsRaw]] = js.undefined
  }
  object LicenseSpec {
    
    inline def apply(body: js.Array[BodySpec]): LicenseSpec = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[LicenseSpec]
    }
    
    extension [Self <: LicenseSpec](x: Self) {
      
      inline def setBody(value: js.Array[BodySpec]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyVarargs(value: BodySpec*): Self = StObject.set(x, "body", js.Array(value*))
      
      inline def setDefaultLang(value: LangSpec): Self = StObject.set(x, "defaultLang", value.asInstanceOf[js.Any])
      
      inline def setDefaultLangUndefined: Self = StObject.set(x, "defaultLang", js.undefined)
      
      inline def setLabels(value: js.Array[LabelsInline]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLabelsVarargs(value: LabelsInline*): Self = StObject.set(x, "labels", js.Array(value*))
      
      inline def setRawLabels(value: js.Array[LabelsRaw]): Self = StObject.set(x, "rawLabels", value.asInstanceOf[js.Any])
      
      inline def setRawLabelsUndefined: Self = StObject.set(x, "rawLabels", js.undefined)
      
      inline def setRawLabelsVarargs(value: LabelsRaw*): Self = StObject.set(x, "rawLabels", js.Array(value*))
    }
  }
  
  trait Options extends StObject {
    
    var onNonFatalError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    var resolvePath: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOnNonFatalError(value: /* error */ js.Error => Callback): Self = StObject.set(x, "onNonFatalError", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
      
      inline def setOnNonFatalErrorUndefined: Self = StObject.set(x, "onNonFatalError", js.undefined)
      
      inline def setResolvePath(value: /* path */ String => String): Self = StObject.set(x, "resolvePath", js.Any.fromFunction1(value))
      
      inline def setResolvePathUndefined: Self = StObject.set(x, "resolvePath", js.undefined)
    }
  }
}
