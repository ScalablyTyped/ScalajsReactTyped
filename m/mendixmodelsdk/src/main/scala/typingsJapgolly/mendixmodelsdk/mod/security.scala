package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IModule
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IProject
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object security {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Security`.
    */
  /* note: abstract class */ @JSImport("mendixmodelsdk", "security.AccessRuleContainerBase")
  @js.native
  open class AccessRuleContainerBase protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.security.AccessRuleContainerBase {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object AccessRuleContainerBase {
    
    @JSImport("mendixmodelsdk", "security.AccessRuleContainerBase")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.AccessRuleContainerBase.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.AccessRuleContainerBase.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/demo-users relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "security.DemoUser")
  @js.native
  open class DemoUser protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.security.DemoUser {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DemoUser {
    
    @JSImport("mendixmodelsdk", "security.DemoUser")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DemoUser instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.DemoUser = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.DemoUser]
    
    /**
      * Creates and returns a new DemoUser instance in the SDK and on the server.
      * The new DemoUser will be automatically stored in the 'demoUsers' property
      * of the parent ProjectSecurity element passed as argument.
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.ProjectSecurity): typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.DemoUser = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.DemoUser]
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.DemoUser.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.DemoUser.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "security.FileDocumentAccessRuleContainer")
  @js.native
  open class FileDocumentAccessRuleContainer protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.security.FileDocumentAccessRuleContainer {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object FileDocumentAccessRuleContainer {
    
    @JSImport("mendixmodelsdk", "security.FileDocumentAccessRuleContainer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.FileDocumentAccessRuleContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.FileDocumentAccessRuleContainer]
    
    /**
      * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
      * The new FileDocumentAccessRuleContainer will be automatically stored in the 'fileDocumentAccess' property
      * of the parent ProjectSecurity element passed as argument.
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.ProjectSecurity): typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.FileDocumentAccessRuleContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.FileDocumentAccessRuleContainer]
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.FileDocumentAccessRuleContainer.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.FileDocumentAccessRuleContainer.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "security.ImageAccessRuleContainer")
  @js.native
  open class ImageAccessRuleContainer protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.security.ImageAccessRuleContainer {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ImageAccessRuleContainer {
    
    @JSImport("mendixmodelsdk", "security.ImageAccessRuleContainer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.ImageAccessRuleContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.ImageAccessRuleContainer]
    
    /**
      * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
      * The new ImageAccessRuleContainer will be automatically stored in the 'imageAccess' property
      * of the parent ProjectSecurity element passed as argument.
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.ProjectSecurity): typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.ImageAccessRuleContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.ImageAccessRuleContainer]
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.ImageAccessRuleContainer.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.ImageAccessRuleContainer.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/module-security relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "security.ModuleRole")
  @js.native
  open class ModuleRole protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.security.ModuleRole {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ModuleRole {
    
    @JSImport("mendixmodelsdk", "security.ModuleRole")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ModuleRole instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.ModuleRole = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.ModuleRole]
    
    /**
      * Creates and returns a new ModuleRole instance in the SDK and on the server.
      * The new ModuleRole will be automatically stored in the 'moduleRoles' property
      * of the parent ModuleSecurity element passed as argument.
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.ModuleSecurity): typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.ModuleRole = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.ModuleRole]
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.ModuleRole.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.ModuleRole.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/module-security relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "security.ModuleSecurity")
  @js.native
  open class ModuleSecurity protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.security.ModuleSecurity {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IModule
    ) = this()
  }
  object ModuleSecurity {
    
    @JSImport("mendixmodelsdk", "security.ModuleSecurity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ModuleSecurity unit in the SDK and on the server.
      * Expects one argument, the projects.IModule in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IModule): typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.ModuleSecurity = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.ModuleSecurity]
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.ModuleSecurity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.ModuleSecurity.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/password-policy relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "security.PasswordPolicySettings")
  @js.native
  open class PasswordPolicySettings protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.security.PasswordPolicySettings {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object PasswordPolicySettings {
    
    @JSImport("mendixmodelsdk", "security.PasswordPolicySettings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.PasswordPolicySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.PasswordPolicySettings]
    
    /**
      * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
      * The new PasswordPolicySettings will be automatically stored in the 'passwordPolicySettings' property
      * of the parent ProjectSecurity element passed as argument.
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.ProjectSecurity): typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.PasswordPolicySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.PasswordPolicySettings]
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.PasswordPolicySettings.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.PasswordPolicySettings.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/project-security relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "security.ProjectSecurity")
  @js.native
  open class ProjectSecurity protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.security.ProjectSecurity {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  object ProjectSecurity {
    
    @JSImport("mendixmodelsdk", "security.ProjectSecurity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ProjectSecurity unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IProject): typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.ProjectSecurity = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.ProjectSecurity]
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.ProjectSecurity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.ProjectSecurity.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "security.SecurityLevel")
  @js.native
  open class SecurityLevel protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.security.SecurityLevel {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object SecurityLevel {
    
    @JSImport("mendixmodelsdk", "security.SecurityLevel")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.SecurityLevel.CheckEverything")
    @js.native
    def CheckEverything: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.SecurityLevel = js.native
    inline def CheckEverything_=(x: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.SecurityLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckEverything")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.SecurityLevel.CheckFormsAndMicroflows")
    @js.native
    def CheckFormsAndMicroflows: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.SecurityLevel = js.native
    inline def CheckFormsAndMicroflows_=(x: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.SecurityLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckFormsAndMicroflows")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.SecurityLevel.CheckNothing")
    @js.native
    def CheckNothing: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.SecurityLevel = js.native
    inline def CheckNothing_=(x: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.SecurityLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckNothing")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/user-roles relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "security.UserRole")
  @js.native
  open class UserRole protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.security.UserRole {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object UserRole {
    
    @JSImport("mendixmodelsdk", "security.UserRole")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new UserRole instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.UserRole = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.UserRole]
    
    /**
      * Creates and returns a new UserRole instance in the SDK and on the server.
      * The new UserRole will be automatically stored in the 'userRoles' property
      * of the parent ProjectSecurity element passed as argument.
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.ProjectSecurity): typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.UserRole = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.UserRole]
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.UserRole.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.UserRole.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
