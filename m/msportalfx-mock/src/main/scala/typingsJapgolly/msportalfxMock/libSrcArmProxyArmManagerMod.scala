package typingsJapgolly.msportalfxMock

import typingsJapgolly.msportalfxMock.libSrcArmProxyMockModelsMockModelMod.NestedResource
import typingsJapgolly.msportalfxMock.libSrcArmProxyModelsArmEventMod.EventData
import typingsJapgolly.msportalfxMock.libSrcArmProxyModelsArmLocationMod.Location
import typingsJapgolly.msportalfxMock.libSrcArmProxyModelsArmProviderMod.Provider
import typingsJapgolly.msportalfxMock.libSrcArmProxyModelsArmResourceGroupMod.ResourceGroup
import typingsJapgolly.msportalfxMock.libSrcArmProxyModelsArmResourceMod.Resource
import typingsJapgolly.msportalfxMock.libSrcArmProxyModelsArmSubscriptionMod.Subscription
import typingsJapgolly.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcArmProxyArmManagerMod {
  
  object ArmManager {
    
    /**
      * The mock azure resource manager
      */
    @JSImport("msportalfx-mock/lib/src/ArmProxy/armManager", "ArmManager.Manager")
    @js.native
    open class Manager () extends StObject {
      
      /* private */ var data: Any = js.native
      
      /* private */ var events: Any = js.native
      
      /**
        * Gets a subscription based on id from the mock data.
        *
        * @param subscriptionId The subscription GUID/ID.
        */
      def getEvents(subscriptionId: String): js.Array[EventData] = js.native
      
      /**
        * Gets list of mock locations.
        */
      def getLocations(): js.Array[Location] = js.native
      
      def getNestedResourceData(
        subscriptionId: String,
        resourceGroupId: String,
        `type`: String,
        resourceName: String,
        nestedType: String,
        nestedResourceName: String
      ): NestedResource = js.native
      
      /**
        * Gets the list of providers.
        */
      def getProviders(): js.Array[Provider] = js.native
      
      /**
        * Gets a resource under a subscription and resource group.
        *
        * @param subscriptionId The subscription GUID/ID.
        * @param resourceGroupId The resource group name.
        * @param type The resource type.
        * @param resourceName The resource name.
        */
      def getResource(subscriptionId: String, resourceGroupId: String, `type`: String, resourceName: String): Resource = js.native
      
      def getResourceData(subscriptionId: String, resourceGroupId: String, `type`: String, resourceName: String): typingsJapgolly.msportalfxMock.libSrcArmProxyMockModelsMockModelMod.Resource = js.native
      
      /**
        * Gets the resource group based on id from the mock data.
        *
        * @param subscriptionId The subscription GUID/ID.
        * @param resourceGroupId The resource group name.
        */
      def getResourceGroup(subscriptionId: String, resourceGroupId: String): ResourceGroup = js.native
      
      def getResourceGroupData(subscriptionId: String, resourceGroupId: String): typingsJapgolly.msportalfxMock.libSrcArmProxyMockModelsMockModelMod.ResourceGroup = js.native
      
      /**
        * Gets the list of mock resource groups under a subscription.
        *
        * @param subscriptionId The subscription GUID/ID.
        */
      def getResourceGroups(subscriptionId: String): js.Array[ResourceGroup] = js.native
      
      /**
        * Gets all resources under a subscription and resource group
        *
        * @param subscriptionId The subscription GUID/ID.
        * @param resourceGroupId The resource group name.
        */
      def getResources(subscriptionId: String, resourceGroupId: String): js.Array[Resource] = js.native
      
      /**
        * Gets a subscription based on id from the mock data.
        *
        * @param subscriptionId The subscription GUID/ID.
        */
      def getSubscription(subscriptionId: String): Subscription = js.native
      
      def getSubscriptionData(subscriptionId: String): typingsJapgolly.msportalfxMock.libSrcArmProxyMockModelsMockModelMod.Subscription = js.native
      
      /**
        * Gets the list of mock subscriptions.
        */
      def getSubscriptions(): js.Array[Subscription] = js.native
      
      /**
        * Initializes the mock data. Call this with empty data to reset state.
        *
        * @param data The mock data.
        * @return A promise that is resolved when the data is initialized.
        */
      def initializeMockData(data: MockData): Promise[Any] = js.native
      
      /**
        * Publishes a subscription event.
        *
        * @param subscriptionId The subscription GUID/ID.
        * @param data The event data.
        */
      def publishEvent(subscriptionId: String, data: EventData): Unit = js.native
    }
    
    /**
      * Defines structore of mock data.
      */
    trait MockData extends StObject {
      
      var providers: js.UndefOr[js.Array[Provider]] = js.undefined
      
      var subscriptions: js.UndefOr[
            js.Array[typingsJapgolly.msportalfxMock.libSrcArmProxyMockModelsMockModelMod.Subscription]
          ] = js.undefined
    }
    object MockData {
      
      inline def apply(): MockData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MockData]
      }
      
      extension [Self <: MockData](x: Self) {
        
        inline def setProviders(value: js.Array[Provider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
        
        inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
        
        inline def setProvidersVarargs(value: Provider*): Self = StObject.set(x, "providers", js.Array(value*))
        
        inline def setSubscriptions(value: js.Array[typingsJapgolly.msportalfxMock.libSrcArmProxyMockModelsMockModelMod.Subscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
        
        inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
        
        inline def setSubscriptionsVarargs(value: typingsJapgolly.msportalfxMock.libSrcArmProxyMockModelsMockModelMod.Subscription*): Self = StObject.set(x, "subscriptions", js.Array(value*))
      }
    }
  }
}
