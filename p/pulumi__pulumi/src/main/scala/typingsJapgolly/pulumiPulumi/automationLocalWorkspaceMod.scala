package typingsJapgolly.pulumiPulumi

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.automationProjectSettingsMod.ProjectSettings
import typingsJapgolly.pulumiPulumi.automationStackMod.Stack
import typingsJapgolly.pulumiPulumi.automationStackSettingsMod.StackSettings
import typingsJapgolly.pulumiPulumi.automationWorkspaceMod.PulumiFn
import typingsJapgolly.pulumiPulumi.automationWorkspaceMod.Workspace
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object automationLocalWorkspaceMod {
  
  @JSImport("@pulumi/pulumi/automation/localWorkspace", "LocalWorkspace")
  @js.native
  /* private */ open class LocalWorkspace ()
    extends StObject
       with Workspace {
    
    /* private */ var _pulumiVersion: Any = js.native
    
    /* private */ var getPulumiVersion: Any = js.native
    
    /**
      * The version of the underlying Pulumi CLI/Engine.
      *
      * @returns A string representation of the version, if available. `null` otherwise.
      */
    @JSName("pulumiVersion")
    def pulumiVersion_MLocalWorkspace: String = js.native
    
    /* private */ var ready: Any = js.native
    
    /* private */ var runPulumiCmd: Any = js.native
  }
  /* static members */
  object LocalWorkspace {
    
    @JSImport("@pulumi/pulumi/automation/localWorkspace", "LocalWorkspace")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a workspace using the specified options. Used for maximal control and customization
      * of the underlying environment before any stacks are created or selected.
      *
      * @param opts Options used to configure the Workspace
      */
    inline def create(opts: LocalWorkspaceOptions): js.Promise[LocalWorkspace] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LocalWorkspace]]
    
    /**
      * Creates or selects an existing Stack with a LocalWorkspace utilizing the specified inline Pulumi CLI program.
      * This program is fully debuggable and runs in process. If no Project option is specified, default project settings will be created
      * on behalf of the user. Similarly, unless a `workDir` option is specified, the working directory will default
      * to a new temporary directory provided by the OS.
      *
      * @param args A set of arguments to initialize a Stack with and inline `PulumiFn` program that runs in process.
      * @param opts Additional customizations to be applied to the Workspace.
      */
    inline def createOrSelectStack(args: InlineProgramArgs): js.Promise[Stack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOrSelectStack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stack]]
    inline def createOrSelectStack(args: InlineProgramArgs, opts: LocalWorkspaceOptions): js.Promise[Stack] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrSelectStack")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stack]]
    /**
      * Creates or selects an existing Stack with a LocalWorkspace utilizing the specified inline (in process) Pulumi CLI program.
      * This program is fully debuggable and runs in process. If no Project option is specified, default project settings
      * will be created on behalf of the user. Similarly, unless a `workDir` option is specified, the working directory
      * will default to a new temporary directory provided by the OS.
      *
      * @param args A set of arguments to initialize a Stack with a pre-configured Pulumi CLI program that already exists on disk.
      * @param opts Additional customizations to be applied to the Workspace.
      */
    inline def createOrSelectStack(args: LocalProgramArgs): js.Promise[Stack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOrSelectStack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stack]]
    inline def createOrSelectStack(args: LocalProgramArgs, opts: LocalWorkspaceOptions): js.Promise[Stack] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrSelectStack")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stack]]
    
    /**
      * Creates a Stack with a LocalWorkspace utilizing the specified inline (in process) Pulumi program.
      * This program is fully debuggable and runs in process. If no Project option is specified, default project settings
      * will be created on behalf of the user. Similarly, unless a `workDir` option is specified, the working directory
      * will default to a new temporary directory provided by the OS.
      *
      * @param args A set of arguments to initialize a Stack with and inline `PulumiFn` program that runs in process.
      * @param opts Additional customizations to be applied to the Workspace.
      */
    inline def createStack(args: InlineProgramArgs): js.Promise[Stack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stack]]
    inline def createStack(args: InlineProgramArgs, opts: LocalWorkspaceOptions): js.Promise[Stack] = (^.asInstanceOf[js.Dynamic].applyDynamic("createStack")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stack]]
    /**
      * Creates a Stack with a LocalWorkspace utilizing the local Pulumi CLI program from the specified workDir.
      * This is a way to create drivers on top of pre-existing Pulumi programs. This Workspace will pick up
      * any available Settings files (Pulumi.yaml, Pulumi.<stack>.yaml).
      *
      * @param args A set of arguments to initialize a Stack with a pre-configured Pulumi CLI program that already exists on disk.
      * @param opts Additional customizations to be applied to the Workspace.
      */
    inline def createStack(args: LocalProgramArgs): js.Promise[Stack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stack]]
    inline def createStack(args: LocalProgramArgs, opts: LocalWorkspaceOptions): js.Promise[Stack] = (^.asInstanceOf[js.Dynamic].applyDynamic("createStack")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stack]]
    
    @JSImport("@pulumi/pulumi/automation/localWorkspace", "LocalWorkspace.inlineSourceStackHelper")
    @js.native
    def inlineSourceStackHelper: Any = js.native
    inline def inlineSourceStackHelper_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inlineSourceStackHelper")(x.asInstanceOf[js.Any])
    
    @JSImport("@pulumi/pulumi/automation/localWorkspace", "LocalWorkspace.localSourceStackHelper")
    @js.native
    def localSourceStackHelper: Any = js.native
    inline def localSourceStackHelper_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localSourceStackHelper")(x.asInstanceOf[js.Any])
    
    /**
      * Selects an existing Stack with a LocalWorkspace utilizing the specified inline (in process) Pulumi program.
      * This program is fully debuggable and runs in process. If no Project option is specified, default project settings
      * will be created on behalf of the user. Similarly, unless a `workDir` option is specified, the working directory
      * will default to a new temporary directory provided by the OS.
      *
      * @param args A set of arguments to initialize a Stack with and inline `PulumiFn` program that runs in process.
      * @param opts Additional customizations to be applied to the Workspace.
      */
    inline def selectStack(args: InlineProgramArgs): js.Promise[Stack] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectStack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stack]]
    inline def selectStack(args: InlineProgramArgs, opts: LocalWorkspaceOptions): js.Promise[Stack] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectStack")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stack]]
    /**
      * Selects a Stack with a LocalWorkspace utilizing the local Pulumi CLI program from the specified workDir.
      * This is a way to create drivers on top of pre-existing Pulumi programs. This Workspace will pick up
      * any available Settings files (Pulumi.yaml, Pulumi.<stack>.yaml).
      *
      * @param args A set of arguments to initialize a Stack with a pre-configured Pulumi CLI program that already exists on disk.
      * @param opts Additional customizations to be applied to the Workspace.
      */
    inline def selectStack(args: LocalProgramArgs): js.Promise[Stack] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectStack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stack]]
    inline def selectStack(args: LocalProgramArgs, opts: LocalWorkspaceOptions): js.Promise[Stack] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectStack")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stack]]
  }
  
  trait InlineProgramArgs extends StObject {
    
    /**
      * The inline (in process) Pulumi program to use with Update and Preview operations.
      */
    def program(): js.Promise[(Record[String, Any]) | Unit]
    /**
      * The inline (in process) Pulumi program to use with Update and Preview operations.
      */
    @JSName("program")
    var program_Original: PulumiFn
    
    /**
      * The name of the associated project
      */
    var projectName: String
    
    /**
      * The name of the associated Stack
      */
    var stackName: String
  }
  object InlineProgramArgs {
    
    inline def apply(
      program: CallbackTo[js.Promise[(Record[String, Any]) | Unit]],
      projectName: String,
      stackName: String
    ): InlineProgramArgs = {
      val __obj = js.Dynamic.literal(program = program.toJsFn, projectName = projectName.asInstanceOf[js.Any], stackName = stackName.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineProgramArgs]
    }
    
    extension [Self <: InlineProgramArgs](x: Self) {
      
      inline def setProgram(value: CallbackTo[js.Promise[(Record[String, Any]) | Unit]]): Self = StObject.set(x, "program", value.toJsFn)
      
      inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
      
      inline def setStackName(value: String): Self = StObject.set(x, "stackName", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocalProgramArgs extends StObject {
    
    var stackName: String
    
    var workDir: String
  }
  object LocalProgramArgs {
    
    inline def apply(stackName: String, workDir: String): LocalProgramArgs = {
      val __obj = js.Dynamic.literal(stackName = stackName.asInstanceOf[js.Any], workDir = workDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalProgramArgs]
    }
    
    extension [Self <: LocalProgramArgs](x: Self) {
      
      inline def setStackName(value: String): Self = StObject.set(x, "stackName", value.asInstanceOf[js.Any])
      
      inline def setWorkDir(value: String): Self = StObject.set(x, "workDir", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocalWorkspaceOptions extends StObject {
    
    /**
      * Environment values scoped to the current workspace. These will be supplied to every Pulumi command.
      */
    var envVars: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      *  The inline program `PulumiFn` to be used for Preview/Update operations if any.
      *  If none is specified, the stack will refer to ProjectSettings for this information.
      */
    var program: js.UndefOr[PulumiFn] = js.undefined
    
    /**
      * The settings object for the current project.
      */
    var projectSettings: js.UndefOr[ProjectSettings] = js.undefined
    
    /**
      * The directory to override for CLI metadata
      */
    var pulumiHome: js.UndefOr[String] = js.undefined
    
    /**
      * The secrets provider to use for encryption and decryption of stack secrets.
      * See: https://www.pulumi.com/docs/intro/concepts/secrets/#available-encryption-providers
      */
    var secretsProvider: js.UndefOr[String] = js.undefined
    
    /**
      * A map of Stack names and corresponding settings objects.
      */
    var stackSettings: js.UndefOr[StringDictionary[StackSettings]] = js.undefined
    
    /**
      * The directory to run Pulumi commands and read settings (Pulumi.yaml and Pulumi.<stack>.yaml)l.
      */
    var workDir: js.UndefOr[String] = js.undefined
  }
  object LocalWorkspaceOptions {
    
    inline def apply(): LocalWorkspaceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalWorkspaceOptions]
    }
    
    extension [Self <: LocalWorkspaceOptions](x: Self) {
      
      inline def setEnvVars(value: StringDictionary[String]): Self = StObject.set(x, "envVars", value.asInstanceOf[js.Any])
      
      inline def setEnvVarsUndefined: Self = StObject.set(x, "envVars", js.undefined)
      
      inline def setProgram(value: CallbackTo[js.Promise[(Record[String, Any]) | Unit]]): Self = StObject.set(x, "program", value.toJsFn)
      
      inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
      
      inline def setProjectSettings(value: ProjectSettings): Self = StObject.set(x, "projectSettings", value.asInstanceOf[js.Any])
      
      inline def setProjectSettingsUndefined: Self = StObject.set(x, "projectSettings", js.undefined)
      
      inline def setPulumiHome(value: String): Self = StObject.set(x, "pulumiHome", value.asInstanceOf[js.Any])
      
      inline def setPulumiHomeUndefined: Self = StObject.set(x, "pulumiHome", js.undefined)
      
      inline def setSecretsProvider(value: String): Self = StObject.set(x, "secretsProvider", value.asInstanceOf[js.Any])
      
      inline def setSecretsProviderUndefined: Self = StObject.set(x, "secretsProvider", js.undefined)
      
      inline def setStackSettings(value: StringDictionary[StackSettings]): Self = StObject.set(x, "stackSettings", value.asInstanceOf[js.Any])
      
      inline def setStackSettingsUndefined: Self = StObject.set(x, "stackSettings", js.undefined)
      
      inline def setWorkDir(value: String): Self = StObject.set(x, "workDir", value.asInstanceOf[js.Any])
      
      inline def setWorkDirUndefined: Self = StObject.set(x, "workDir", js.undefined)
    }
  }
}
